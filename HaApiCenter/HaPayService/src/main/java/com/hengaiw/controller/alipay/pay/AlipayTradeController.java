package com.hengaiw.controller.alipay.pay;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.domain.AlipayTradeAppPayModel;
import com.alipay.api.domain.AlipayTradeFastpayRefundQueryModel;
import com.alipay.api.domain.AlipayTradePagePayModel;
import com.alipay.api.domain.AlipayTradeWapPayModel;
import com.alipay.api.request.AlipayTradeAppPayRequest;
import com.alipay.api.request.AlipayTradeFastpayRefundQueryRequest;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.alipay.api.request.AlipayTradeWapPayRequest;
import com.alipay.api.response.AlipayTradeAppPayResponse;
import com.alipay.api.response.AlipayTradeFastpayRefundQueryResponse;
import com.alipay.api.response.AlipayTradePagePayResponse;
import com.alipay.api.response.AlipayTradePrecreateResponse;
import com.alipay.api.response.AlipayTradeWapPayResponse;
import com.google.common.base.Strings;
import com.hengaiw.config.AlipayConfig;
import com.hengaiw.controller.base.BaseValidateController;
import com.hengaiw.model.ExtendParams;
import com.hengaiw.model.GoodsDetail;
import com.hengaiw.model.builder.AlipayTradePayRequestBuilder;
import com.hengaiw.model.builder.AlipayTradePrecreateRequestBuilder;
import com.hengaiw.model.result.AlipayF2FPayResult;
import com.hengaiw.model.result.AlipayF2FPrecreateResult;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.service.HaMerchantProductService;
import com.hengaiw.pay.service.HaMerchantService;
import com.hengaiw.pay.service.HaPayOrderService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaBase64;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;
import com.hengaiw.service.AlipayTradeService;
import com.hengaiw.service.impl.AlipayTradeServiceImpl;
import com.hengaiw.utils.Utils;
import com.hengaiw.utils.ZxingUtils;

/**
 * 支付宝支付类接口
 * 
 * @author jianhuizhang
 *
 */
@RestController
@RequestMapping(value = "/alipay/trade")
public class AlipayTradeController extends BaseValidateController {
	private final HaLog _log = HaLog.getLog(AlipayTradeController.class);
	// 支付宝当面付2.0服务
	private static AlipayTradeService tradeService;
	@Autowired
	private HaPayOrderService payOrderService;
	@Autowired
	public HaMerchantProductService haMerchantProductService;
	@Autowired
	public HaMerchantService haMerchantService;
	@Autowired
	private AlipayConfig alipayConfig;
	
	

	/**
	 * APP支付接口
	 */
	@RequestMapping(value = "appPay")
	public String appPayReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收支付宝APP支付的请求 ######");
		String logPrefix = "【支付宝APP支付】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			String params = merchantProduct.getMerchant_product_params();
			alipayConfig.init(params);
			_log.info("{}支付宝参数:{}", logPrefix, JSON.toJSONString(alipayConfig));
			AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getOpenApiDomain(),
					alipayConfig.getAppid(), alipayConfig.getPrivateKey(), alipayConfig.getFormat(),alipayConfig.getCharset(),
					 alipayConfig.getAlipayPublicKey(), alipayConfig.getSignType());
			AlipayTradeAppPayRequest alipayTradeAppPayRequest = new AlipayTradeAppPayRequest();
			AlipayTradeAppPayModel alipayTradeAppPayModel = new AlipayTradeAppPayModel();
			// alipayTradeAppPayModel.setTimeoutExpress("90m");//该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
			// 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
			alipayTradeAppPayModel.setTotalAmount(Utils.toAmount(payOrder.getOrder_amount()));
			alipayTradeAppPayModel.setProductCode("QUICK_MSECURITY_PAY");
			alipayTradeAppPayModel.setBody(payOrder.getOrder_body());
			alipayTradeAppPayModel.setSubject(payOrder.getOrder_subject());
			alipayTradeAppPayModel.setOutTradeNo(payOrder.getPay_order_sn());
			// alipayTradeAppPayModel.setTimeExpire("");//绝对超时时间，格式为yyyy-MM-dd HH:mm。
			// alipayTradeAppPayModel.setGoodsType("1");//商品主类型 :0-虚拟类商品,1-实物类商品
			alipayTradeAppPayRequest.setBizModel(alipayTradeAppPayModel);
			alipayTradeAppPayRequest.setNotifyUrl(alipayConfig.getNotify_url());
			AlipayTradeAppPayResponse response = alipayClient.pageExecute(alipayTradeAppPayRequest);
			_log.info("{}预下单结果:{}", logPrefix, JSON.toJSONString(response));
			if (response.isSuccess()) {
				_log.info("{}}预下单返回成功",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, response.getBody());
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			} else {
				_log.info("{}}预下单返回失败",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERR_000001));
			}

		} catch (Exception e) {
			_log.error(e, "系统错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
		}
	}

	
	/**
	 * WAP支付接口
	 */
	@RequestMapping(value = "wapPay")
	public String wapPayReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收支付宝WAP支付的请求 ######");
		String logPrefix = "【支付宝WAP支付】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			String params = merchantProduct.getMerchant_product_params();
			alipayConfig.init(params);
			AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getOpenApiDomain(),
					alipayConfig.getAppid(), alipayConfig.getPrivateKey(), alipayConfig.getFormat(),alipayConfig.getCharset(),
					 alipayConfig.getAlipayPublicKey(), alipayConfig.getSignType());
			AlipayTradeWapPayRequest alipayTradeWapPayRequest = new AlipayTradeWapPayRequest();
			AlipayTradeWapPayModel alipayTradeWapPayModel = new AlipayTradeWapPayModel();
			// alipayTradeAppPayModel.setTimeoutExpress("90m");//该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
			// 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
			alipayTradeWapPayModel.setTotalAmount(Utils.toAmount(payOrder.getOrder_amount()));
			alipayTradeWapPayModel.setProductCode("QUICK_WAP_WAY");
			alipayTradeWapPayModel.setBody(payOrder.getOrder_body());
			alipayTradeWapPayModel.setSubject(payOrder.getOrder_subject());
			alipayTradeWapPayModel.setOutTradeNo(payOrder.getPay_order_sn());
			// alipayTradeAppPayModel.setTimeExpire("");//绝对超时时间，格式为yyyy-MM-dd HH:mm。
			// alipayTradeAppPayModel.setGoodsType("1");//商品主类型 :0-虚拟类商品,1-实物类商品
			
			alipayTradeWapPayRequest.setBizModel(alipayTradeWapPayModel);
			alipayTradeWapPayRequest.setNotifyUrl(alipayConfig.getNotify_url());
			AlipayTradeWapPayResponse response = alipayClient.pageExecute(alipayTradeWapPayRequest);
			_log.info("{}预下单结果:{}", logPrefix, JSON.toJSONString(response));
			if (response.isSuccess()) {
				_log.info("{}}预下单返回成功",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, response.getBody());
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			} else {
				_log.info("{}}预下单返回失败",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERR_000001));
			}

		} catch (Exception e) {
			_log.error(e, "系统错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
		}
	}

	/**
	 * WAP支付接口
	 */
	@RequestMapping(value = "pagePay")
	public String pagePayReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收支付宝PC支付的请求 ######");
		String logPrefix = "【支付宝PC支付】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			String params = merchantProduct.getMerchant_product_params();
			alipayConfig.init(params);
			AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getOpenApiDomain(),
					alipayConfig.getAppid(), alipayConfig.getPrivateKey(), alipayConfig.getFormat(),alipayConfig.getCharset(),
					 alipayConfig.getAlipayPublicKey(), alipayConfig.getSignType());
			AlipayTradePagePayRequest alipayTradePagePayRequest = new AlipayTradePagePayRequest();
		    // 封装请求支付信息
		    AlipayTradePagePayModel alipayTradePagePayModel=new AlipayTradePagePayModel();
			// alipayTradeAppPayModel.setTimeoutExpress("90m");//该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
			// 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
		    alipayTradePagePayModel.setTotalAmount(Utils.toAmount(payOrder.getOrder_amount()));
		    alipayTradePagePayModel.setProductCode("QUICK_WAP_WAY");
		    alipayTradePagePayModel.setBody(payOrder.getOrder_body());
		    alipayTradePagePayModel.setSubject(payOrder.getOrder_subject());
		    alipayTradePagePayModel.setOutTradeNo(payOrder.getPay_order_sn());
			// alipayTradeAppPayModel.setTimeExpire("");//绝对超时时间，格式为yyyy-MM-dd HH:mm。
			// alipayTradeAppPayModel.setGoodsType("1");//商品主类型 :0-虚拟类商品,1-实物类商品
		    alipayTradePagePayRequest.setBizModel(alipayTradePagePayModel);
		 // 设置异步通知地址
		    alipayTradePagePayRequest.setNotifyUrl(alipayConfig.getNotify_url());
			AlipayTradePagePayResponse response = alipayClient.pageExecute(alipayTradePagePayRequest);
			_log.info("{}预下单结果:{}", logPrefix, JSON.toJSONString(response));
			if (response.isSuccess()) {
				_log.info("{}}预下单返回成功",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, response.getBody());
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			} else {
				_log.info("{}}预下单返回失败",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERR_000001));
			}

		} catch (Exception e) {
			_log.error(e, "系统错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
		}
	}
	
	
	
	/**
	 * 当面付扫码支付
	 * 
	 * @param jsonParam
	 * @return
	 */
	@RequestMapping(value = "tradePay")
	public String tradePayReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收支付宝当面付的支付请求 ######");
		String logPrefix = "【支付宝当面付】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			String params = merchantProduct.getMerchant_product_params();
			alipayConfig.init(params);
			AlipayTradePayRequestBuilder builder = (AlipayTradePayRequestBuilder) createPayParams(payOrder);
			_log.info("{}回调地址:{}", logPrefix, alipayConfig.getNotify_url());
			_log.info("{}支付参数:{}", logPrefix, builder.toJsonString());
			// 调用tradePay方法获取当面付应答
			tradeService = new AlipayTradeServiceImpl.ClientBuilder().build(alipayConfig);
			AlipayF2FPayResult result = tradeService.tradePay(builder, 5, 5000);
			_log.info("{}支付结果:{}", logPrefix, JSON.toJSONString(result));
			switch (result.getTradeStatus()) {
			case SUCCESS:
				_log.info("支付宝支付成功: )");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, payOrder);
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			case FAILED:
				_log.error("支付宝预下单失败!!!");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_PAY_QR_ERR_000001));
			case UNKNOWN:
				_log.error("系统异常，预下单状态未知!!!");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_PAY_QR_ERR_000002));
			default:
				_log.error("不支持的交易状态，交易返回异常!!!");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_PAY_QR_ERR_000003));
			}
		
		} catch (Exception e) {
			_log.error(e, "查询商户信息错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000001));
		}
	}


	/**
	 * 当面付生成二维码支付
	 * 
	 * @param jsonParam
	 * @return
	 */
	@RequestMapping(value = "tradePrecreate")
	public String tradePrecreateReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收支付宝当面付生成二维码的支付请求 ######");
		String logPrefix = "【支付宝当面付二维码】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			String params = merchantProduct.getMerchant_product_params();
			alipayConfig.init(params);
			AlipayTradePrecreateRequestBuilder builder = (AlipayTradePrecreateRequestBuilder) createPayParams(payOrder);
			_log.info("{}回调地址:{}", logPrefix, alipayConfig.getNotify_url());
			_log.info("{}支付参数:{}", logPrefix, builder.toJsonString());
			tradeService = new AlipayTradeServiceImpl.ClientBuilder().build(alipayConfig);
			AlipayF2FPrecreateResult result = tradeService.tradePrecreate(builder);
			switch (result.getTradeStatus()) {
			case SUCCESS:
				_log.info("支付宝预下单成功: )");
				AlipayTradePrecreateResponse response = result.getResponse();
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, response.getQrCode());
				String filePath = String.format("images/qr/qr-%s.png", response.getOutTradeNo());
				_log.info("filePath:" + filePath);
				ZxingUtils.getQRCodeImge(response.getQrCode(), 256, filePath);
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			case FAILED:
				_log.error("支付宝预下单失败!!!");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_PAY_QR_ERR_000001));
			case UNKNOWN:
				_log.error("系统异常，预下单状态未知!!!");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_PAY_QR_ERR_000002));
			default:
				_log.error("不支持的交易状态，交易返回异常!!!");
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_PAY_QR_ERR_000003));
			}

		} catch (Exception e) {
			_log.error(e, "查询商户信息错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000001));
		}

	}
	
	
	
	/**
	 * 支付宝退款接口
	 */
	@RequestMapping(value = "refund")
	public String refundReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收支付宝退款请求 ######");
		String logPrefix = "【支付宝退款】";
		_log.info("{}获取参数:{}", logPrefix, new String(HaBase64.decode(jsonParam)));
		try {
			HaPayOrder payOrder = JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(payOrder.getMerchant_no());
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			String params = merchantProduct.getMerchant_product_params();
			alipayConfig.init(params);
			AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getOpenApiDomain(),
					alipayConfig.getAppid(), alipayConfig.getPrivateKey(), alipayConfig.getFormat(),alipayConfig.getCharset(),
					 alipayConfig.getAlipayPublicKey(), alipayConfig.getSignType());
			AlipayTradePagePayRequest alipayTradePagePayRequest = new AlipayTradePagePayRequest();
		    // 封装请求支付信息
		    AlipayTradePagePayModel alipayTradePagePayModel=new AlipayTradePagePayModel();
			// alipayTradeAppPayModel.setTimeoutExpress("90m");//该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。
			// 该参数数值不接受小数点， 如 1.5h，可转换为 90m。
		    alipayTradePagePayModel.setTotalAmount(Utils.toAmount(payOrder.getOrder_amount()));
		    alipayTradePagePayModel.setProductCode("QUICK_WAP_WAY");
		    alipayTradePagePayModel.setBody(payOrder.getOrder_body());
		    alipayTradePagePayModel.setSubject(payOrder.getOrder_subject());
		    alipayTradePagePayModel.setOutTradeNo(payOrder.getPay_order_sn());
			// alipayTradeAppPayModel.setTimeExpire("");//绝对超时时间，格式为yyyy-MM-dd HH:mm。
			// alipayTradeAppPayModel.setGoodsType("1");//商品主类型 :0-虚拟类商品,1-实物类商品
		    alipayTradePagePayRequest.setBizModel(alipayTradePagePayModel);
		 // 设置异步通知地址
		    alipayTradePagePayRequest.setNotifyUrl(alipayConfig.getNotify_url());
			AlipayTradePagePayResponse response = alipayClient.pageExecute(alipayTradePagePayRequest);
			_log.info("{}预下单结果:{}", logPrefix, JSON.toJSONString(response));
			if (response.isSuccess()) {
				_log.info("{}}预下单返回成功",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_PAYING);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
						HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, response.getBody());
				return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
			} else {
				_log.info("{}}预下单返回失败",logPrefix);
				payOrder.setOrder_status(HaConstants.PAY_STATUS_FAILED);
				payOrderService.updateByPrimaryKeySelective(payOrder);
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERR_000001));
			}

		} catch (Exception e) {
			_log.error(e, "系统错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
		}
	}
	
	
	/**
	 * 统一收单交易退款查询
	 */
	@RequestMapping(value = "fastpayRefundQuery")
	public String fastpayRefundQueryReq(@RequestParam String jsonParam) {

		_log.info("###### 开始接收支付宝统一收单交易退款查询的支付请求 ######");
		String logPrefix = "【统一收单交易退款查询】";
		try {
			JSONObject paramObj = JSON.parseObject(new String(HaBase64.decode(jsonParam)));
			_log.info("{}收到参数请求:{}", logPrefix, jsonParam);
			if (Strings.isNullOrEmpty(paramObj.getString("merchant_no")))
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERROR_000001));
			if (Strings.isNullOrEmpty(paramObj.getString("query_order_no")))
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERROR_000002));
			if (Strings.isNullOrEmpty(paramObj.getString("pay_order_sn")))
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ALIPAY_TRADE_ERROR_000003));
			HaMerchant merchantInfo = haMerchantService.findByMerchantNo(paramObj.getString("merchant_no"));
			_log.info("{}查询商户信息:{}", logPrefix, JSON.toJSONString(merchantInfo));
			if (merchantInfo == null)
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000001));
			HaPayOrder payOrder = payOrderService.selectByOrderSn(paramObj.getString("pay_order_sn"));
			_log.info("{}查询订单信息:{}", logPrefix, JSON.toJSONString(payOrder));
			if (payOrder == null)
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.ORDER_ERR_000001));
			HaMerchantProduct merchantProduct = haMerchantProductService.selectByPrimaryKey(payOrder.getProduct_id());
			_log.info("{}查询产品信息:{}", logPrefix, JSON.toJSONString(merchantProduct));
			if (merchantProduct == null)
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.PRO_ERR_000001));
			String params = merchantProduct.getMerchant_product_params();
			try {
				alipayConfig.init(params);
				AlipayClient alipayClient = new DefaultAlipayClient(alipayConfig.getOpenApiDomain(),
						alipayConfig.getAppid(), alipayConfig.getPrivateKey(), alipayConfig.getCharset(),
						alipayConfig.getFormat(), alipayConfig.getAlipayPublicKey(), alipayConfig.getSignType());
				AlipayTradeFastpayRefundQueryRequest alipayTradeFastpayRefundQueryRequest = new AlipayTradeFastpayRefundQueryRequest();
				AlipayTradeFastpayRefundQueryModel alipayTradeFastpayRefundQueryModel = new AlipayTradeFastpayRefundQueryModel();
				alipayTradeFastpayRefundQueryModel.setOutRequestNo(paramObj.getString("query_order_no"));
				alipayTradeFastpayRefundQueryModel.setOutTradeNo(paramObj.getString("pay_order_no"));
				alipayTradeFastpayRefundQueryRequest.setBizModel(alipayTradeFastpayRefundQueryModel);
				AlipayTradeFastpayRefundQueryResponse alipayTradeFastpayRefundQueryResponse = alipayClient
						.execute(alipayTradeFastpayRefundQueryRequest);
				_log.info("{}请求支付宝返回信息:{}", logPrefix, JSON.toJSONString(alipayTradeFastpayRefundQueryResponse));
				if (alipayTradeFastpayRefundQueryResponse.isSuccess()) {
					Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "",
							HaConstants.RETURN_VALUE_SUCCESS, null);
					map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, alipayTradeFastpayRefundQueryResponse.getBody());
					return HaUtil.makeRetData(map, merchantInfo.getMerchant_res_key());
				} else {
					return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
							HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
				}
			} catch (Exception e) {
				_log.error(e, logPrefix + "发送请求错误");
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
						HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
			}
		} catch (Exception e) {
			_log.error(e, logPrefix + "请求错误");
			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL, "",
					HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
		}

	}

	
	/**
	 * 当面付参数创建
	 * @param payOrder
	 * @return
	 */
	private Object createPayParams(HaPayOrder payOrder) {
		// (必填) 商户网站订单系统中唯一订单号，64个字符以内，只能包含字母、数字、下划线，
		// 需保证商户系统端不能重复，建议通过数据库sequence生成，
		String outTradeNo = payOrder.getPay_order_sn();// "tradeprecreate" + System.currentTimeMillis()
		// + (long) (Math.random() * 10000000L);

		// (必填) 订单标题，粗略描述用户的支付目的。如“xxx品牌xxx门店当面付扫码消费”
		String subject = payOrder.getOrder_subject();// "xxx品牌xxx门店当面付扫码消费";

		// (必填) 订单总金额，单位为元，不能超过1亿元
		// 如果同时传入了【打折金额】,【不可打折金额】,【订单总金额】三者,则必须满足如下条件:【订单总金额】=【打折金额】+【不可打折金额】
		String totalAmount = Utils.toAmount(payOrder.getOrder_amount());// "0.01";
		String order_extra = payOrder.getOrder_extra();

		JSONObject orderExtraObj = JSON.parseObject(order_extra);
		// (可选) 订单不可打折金额，可以配合商家平台配置折扣活动，如果酒水不参与打折，则将对应金额填写至此字段
		// 如果该值未传入,但传入了【订单总金额】,【打折金额】,则该值默认为【订单总金额】-【打折金额】
		String undiscountableAmount = "0";
		// 卖家支付宝账号ID，用于支持一个签约账号下支持打款到不同的收款账号，(打款到sellerId对应的支付宝账号)
		// 如果该字段为空，则默认为与支付宝签约的商户的PID，也就是appid对应的PID
		String sellerId = "";
		// 订单描述，可以对交易或商品进行一个详细地描述，比如填写"购买商品2件共15.00元"
		String body = payOrder.getOrder_body();// "购买商品3件共20.00元";
		// 商户操作员编号，添加此参数可以为商户操作员做销售统计
		String operatorId = "ha_operator_id";
		if (StringUtils.isNotBlank(orderExtraObj.getString("operatorId"))) {
			operatorId = orderExtraObj.getString("operatorId");
		}
		// (必填) 商户门店编号，通过门店号和商家后台可以配置精准到门店的折扣信息，详询支付宝技术支持
		String storeId = "ha_store_id";
		if (StringUtils.isNotBlank(orderExtraObj.getString("storeId"))) {
			storeId = orderExtraObj.getString("storeId");
		}

		// 支付超时，定义为120分钟
		String timeoutExpress = "120m";
		
		// 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
		JSONObject extendObj = orderExtraObj.getJSONObject("extendParams");
		ExtendParams extendParams = new ExtendParams();
		if (extendObj != null) {
			extendParams.setSysServiceProviderId(extendObj.getString("sysServiceProviderId"));
			//builder.setExtendParams(extendParams);
		}
		// 商品明细列表，需填写购买商品详细信息，
		JSONArray goodsArray = orderExtraObj.getJSONArray("goodsDetail");
		List<GoodsDetail> goodsDetailList = new ArrayList<GoodsDetail>();
		if (goodsArray.size() > 0) {
			GoodsDetail goods = null;
			for (int i = 0; i < goodsArray.size(); i++) {
				JSONObject goodsObj = goodsArray.getJSONObject(i);
				goods = GoodsDetail.newInstance(goodsObj.getString("id"), goodsObj.getString("name"),
						goodsObj.getLongValue("price"), goodsObj.getIntValue("num"));
				goodsDetailList.add(goods);
			}
			//builder.setGoodsDetailList(goodsDetailList);
		}
		switch(payOrder.getTrade_type_nickname()) {
			case HaConstants.PAY_CHANNEL_ALIPAY_FACE:
				String authCode = orderExtraObj.getString("authCode"); // 条码示例，286648048691290423
				AlipayTradePayRequestBuilder tradePayRequestBuilder = new AlipayTradePayRequestBuilder()
						// .setAppAuthToken(appAuthToken)
						.setOutTradeNo(outTradeNo).setSubject(subject).setAuthCode(authCode).setTotalAmount(totalAmount)
						.setStoreId(storeId).setUndiscountableAmount(undiscountableAmount).setBody(body)
						.setOperatorId(operatorId).setSellerId(sellerId).setTimeoutExpress(timeoutExpress);
				// 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
				if (extendParams != null) tradePayRequestBuilder.setExtendParams(extendParams);
				// 商品明细列表，需填写购买商品详细信息，
				if (goodsDetailList.size() > 0) tradePayRequestBuilder.setGoodsDetailList(goodsDetailList);
				return tradePayRequestBuilder;
			case HaConstants.PAY_CHANNEL_ALIPAY_QR:
				// 创建扫码支付请求builder，设置请求参数
				AlipayTradePrecreateRequestBuilder tradePrecreateRequestBuilder = new AlipayTradePrecreateRequestBuilder().setSubject(subject)
						.setTotalAmount(totalAmount).setOutTradeNo(outTradeNo).setUndiscountableAmount(undiscountableAmount)
						.setSellerId(sellerId).setBody(body).setOperatorId(operatorId).setStoreId(storeId)
						.setNotifyUrl(alipayConfig.getNotify_url())// 支付宝服务器主动通知商户服务器里指定的页面http路径,根据需要设置
						.setTimeoutExpress(timeoutExpress);
				// 业务扩展参数，目前可添加由支付宝分配的系统商编号(通过setSysServiceProviderId方法)，详情请咨询支付宝技术支持
				if (extendParams != null) tradePrecreateRequestBuilder.setExtendParams(extendParams);
				// 商品明细列表，需填写购买商品详细信息，
				if (goodsDetailList.size() > 0) tradePrecreateRequestBuilder.setGoodsDetailList(goodsDetailList);
				return tradePrecreateRequestBuilder;
			default:
				
				return null;
		}
		

	}
}
