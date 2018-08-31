package com.hengaiw.admin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.service.HaMerchantService;

@Controller
@RequestMapping("/admin/merchant/")
public class MerchantController {
	@Autowired
	public HaMerchantService haMerchantService;
	
	
	
	@RequestMapping("list.html")
    public String listTpl(ModelMap model) {
        return "admin/merchant/list";
    }
	
	
	@ResponseBody
	@RequestMapping("list_json.html")
    public Object list_jsonTpl(HaMerchant merchant,int page,int limit) {
		int offset=(page-1)*limit;
		List<HaMerchant> list=haMerchantService.selectByExamplePage(offset, limit, merchant);
		long count=haMerchantService.countByRecord(merchant);
		Map<String, Object> retMap = new HashMap<String, Object>();
		retMap.put("code", 0);
		retMap.put("msg", "");
		retMap.put("count", count);
		retMap.put("data", list);
		System.out.println(count);
        return JSON.toJSONString(retMap);
    }
	
}
