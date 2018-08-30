package com.hengaiw.controller.base;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hengaiw.config.Constants;
import com.hengaiw.pay.model.dao.model.HaAgentProduct;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.model.dao.model.HaProduct;
import com.hengaiw.pay.service.HaPayOrderService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaBase64;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaSerial;
import com.hengaiw.pub.utils.HaUtil;

/**
 * @Description: 商家接口，查询商家等
 */
@RestController
@RequestMapping(value = "/payorder")
public class PayOrderController extends BaseValidateController{
	private final HaLog _log = HaLog.getLog(PayOrderController.class);
	@Autowired
	private HaPayOrderService haPayOrderService;
	/**
	 * 添加订单
	 */
	@RequestMapping(value="create")
	public String payOrderCreateReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收商户添加订单请求 ######");
		String logPrefix = "【商户添加订单】";
		try {
			JSONObject orderObj = JSON.parseObject(new String(HaBase64.decode(jsonParam)));
			_log.info("{}参数:{}", logPrefix, JSON.toJSONString(orderObj));
			Object validateObj=MerchantValidate(orderObj);
			if(validateObj instanceof String) {
				_log.info("{}参数校验不通过:{}", logPrefix, validateObj);
				return validateObj.toString();
			}
			HaPayOrder order=JSON.parseObject(new String(HaBase64.decode(jsonParam)), HaPayOrder.class);
			Map obj=(Map)validateObj;
			HaMerchant merchantInfo=(HaMerchant) obj.get("merchantInfo");
			HaMerchantProduct merchantProduct=(HaMerchantProduct)obj.get("merchantProduct");
			HaProduct  product=(HaProduct)obj.get("product");
			HaAgentProduct  agentProduct=(HaAgentProduct)obj.get("agentProduct");
			order.setPay_order_sn(HaSerial.getPay());
			order.setMerchant_id(merchantInfo.getMerchant_id());
			order.setAgent_id(merchantInfo.getAgent_id());
			order.setProduct_id(product.getProduct_id());
			order.setMerchant_product_id(merchantProduct.getMerchant_product_id());
			order.setProduct_type(product.getProduct_type());
			order.setMerchant_rate(merchantProduct.getMerchant_rate());
			order.setMerchant_charge((int) ((order.getOrder_amount()*merchantProduct.getMerchant_rate())/Constants.RATEBASE));
			order.setAgent_rate(agentProduct.getAgent_rate());
			order.setAgent_charge((int) ((order.getOrder_amount()*agentProduct.getAgent_rate())/Constants.RATEBASE));
			order.setProduct_rate(product.getProduct_rate());
			order.setProduct_charge((int) ((order.getOrder_amount()*product.getProduct_rate())/Constants.RATEBASE));
			int result =haPayOrderService.insertSelective(order);
			if(result>0) {
				_log.error("商户添加订单成功");
				merchantProduct.setMerchant_day_use(merchantProduct.getMerchant_day_use()+order.getOrder_amount());
				haMerchantProductService.updateByPrimaryKeySelective(merchantProduct);
				product.setProduct_day_use(product.getProduct_day_use()+order.getOrder_amount());
				haProductService.updateByPrimaryKeySelective(product);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "", HaConstants.RETURN_VALUE_SUCCESS, null);
				map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, JSON.toJSONString(order));
				return JSON.toJSONString(map);
			}else {
				_log.error("商户添加订单失败");
	            return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
			}
		}catch (Exception e) {
            _log.error(e, "商户添加订单失败");
            return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000001));
        }
	}
	
	
	
}
