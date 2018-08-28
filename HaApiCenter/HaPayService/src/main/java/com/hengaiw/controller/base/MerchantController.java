package com.hengaiw.controller.base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.StringUtil;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.service.HaMerchantProductService;
import com.hengaiw.pay.service.HaMerchantService;
import com.hengaiw.pay.service.HaProductService;
import com.hengaiw.pub.constant.HaConstants;
import com.hengaiw.pub.constant.HaReturnCodeEnum;
import com.hengaiw.pub.utils.HaBase64;
import com.hengaiw.pub.utils.HaLog;
import com.hengaiw.pub.utils.HaUtil;

/**
 * @Description: 商家接口，查询商家等
 */
@RestController
@RequestMapping(value = "/merchant")
public class MerchantController {
	private final HaLog _log = HaLog.getLog(MerchantController.class);
	@Autowired
	private HaMerchantService haMerchantService;
	@Autowired
	private HaMerchantProductService haMerchantProductService;
	@Autowired
	private HaProductService haProductService;
	/**
	 * 获取商家信息方便进行数据核验
	 */
	@RequestMapping(value="product")
	public String merchantInfoReq(@RequestParam String jsonParam) {
		_log.info("###### 开始接收商户信息查询请求 ######");
		String logPrefix = "【商户信息查询】";
		try {
			JSONObject paramObj = JSON.parseObject(new String(HaBase64.decode(jsonParam)));
			String merchant_no=paramObj.getString("merchant_no");
			if (StringUtil.isEmpty(merchant_no)) {
				return HaUtil.makeRetFail(HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_FAIL,"",HaConstants.RETURN_VALUE_FAIL, HaReturnCodeEnum.HA_ERR_000002));
			}
			HaMerchant merchantInfo=new HaMerchant();
			merchantInfo.setMerchant_no(merchant_no);
			List<HaMerchant> list=haMerchantService.selectByExamplePage(0, 1, merchantInfo);
			if(list.size()>0) {
				merchantInfo=list.get(0);
				Map<String, Object> map = HaUtil.makeReturnMap(HaConstants.RETURN_VALUE_SUCCESS, "", HaConstants.RETURN_VALUE_SUCCESS, null);
				if(merchantInfo.getMerchant_status()==true) {
	        			_log.info("{}商户信息查询成功{}", logPrefix,JSON.toJSONString(merchantInfo));
	        			map.put(HaConstants.RETURN_PARAM_RETURN_OBJ, JSON.toJSONString(merchantInfo));
	        			return JSON.toJSONString(map);
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
