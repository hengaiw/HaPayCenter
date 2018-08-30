package com.hengaiw.controller.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.StringUtil;
import com.hengaiw.pay.model.dao.model.HaAgentProduct;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.service.HaAgentProductService;
import com.hengaiw.pay.service.HaMerchantProductService;
import com.hengaiw.pay.service.HaMerchantService;
import com.hengaiw.pay.service.HaProductService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;

public class BaseValidateController {
	private final HaLog _log = HaLog.getLog(BaseValidateController.class);
	@Autowired
	public HaMerchantService haMerchantService;
	@Autowired
	public HaMerchantProductService haMerchantProductService;
	@Autowired
	public HaProductService haProductService;
	@Autowired
	public HaAgentProductService haAgentProductService;
	
	/**
	 * 商户校验，进行有效渠道检索
	 * @param paramObj
	 * @return
	 */
	public Object MerchantValidate(JSONObject paramObj) {
		_log.info("###### 开始接收商户信息查询请求 ######");
		String logPrefix = "【商户信息查询】";
		try {
			String merchant_no=paramObj.getString("merchant_no");
			String trade_type_nickname=paramObj.getString("trade_type_nickname");
			if (StringUtil.isEmpty(merchant_no) || StringUtil.isEmpty(trade_type_nickname)) {
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000002));
			}
			HaMerchant merchantInfo=haMerchantService.findByMerchantNo(merchant_no);
			HaMerchantProduct merchantProduct=new HaMerchantProduct();
			if(merchantInfo!=null) {
		        if(merchantInfo.getMerchant_status()==true) {
		        		_log.info("{}商户信息查询成功{}", logPrefix,JSON.toJSONString(merchantInfo));
		        		merchantProduct.setMerchant_id(merchantInfo.getMerchant_id());
		        		merchantProduct.setMerchant_no(merchant_no);
		        		merchantProduct.setTrade_type_nickname(trade_type_nickname);
		        		merchantProduct.setProduct_status(true);
		        		List<HaMerchantProduct> productList=haMerchantProductService.selectByExamplePage(0, 10, merchantProduct);
		        		_log.info("{}商户的产品信息查询成功{}", logPrefix,JSON.toJSONString(productList));
		        		if(productList.size()>0) {
		        			List<HaMerchantProduct> productArray=new ArrayList<HaMerchantProduct>();
		        			for(HaMerchantProduct product:productList) {
		        				if (product.getProduct_type().equals("ALIPAY")||product.getProduct_type().equals("WX")) {
		        					int order_amount=paramObj.getIntValue("order_amount");
		        					if(order_amount>0 && order_amount<=product.getMerchant_order_limit() && (order_amount+product.getMerchant_day_use()<=product.getMerchant_day_limit())) {
		        						productArray.add(product);
		        					}
		        				}else if(product.getProduct_type().equals("DATA")){
		        					//数据查询类产品
		        					productArray.add(product);
		        				}
		        			}
		        			if(productArray.size()>0) {
		        				Map<String, Object> returnMap =new HashMap<String, Object>();
		        				returnMap.put("merchantInfo",merchantInfo);
		        				merchantProduct=productArray.get(0);
		        				_log.info("{}商户的使用产品信息{}", logPrefix,JSON.toJSONString(merchantProduct));
		        				returnMap.put("merchantProduct",merchantProduct);
		        				HaAgentProduct agentProduct=new HaAgentProduct();
		        				agentProduct.setAgent_id(merchantInfo.getAgent_id());
		        				agentProduct.setProduct_id(merchantProduct.getProduct_id());
		        				List<HaAgentProduct> agentProductList=haAgentProductService.selectByExamplePage(0, 1, agentProduct);
		        				if(agentProductList.size()>0)agentProduct=agentProductList.get(0);
		        				returnMap.put("agentProduct", agentProduct);
		        				returnMap.put("product", haProductService.selectByPrimaryKey(productArray.get(0).getProduct_id()));
							return returnMap;
		        			}else {
		        				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000004));
		        			}
		        		}else {
		        			return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000004));
		        		}
		        		
		        }else {
		        		return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000002));
		        }
			}else {
				_log.info("{}商户信息为空。", logPrefix);
	            return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000003));
			}
		}catch (Exception e) {
            _log.error(e, "查询商户信息错误");
            return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.MCH_ERR_000001));
        }
	}
}
