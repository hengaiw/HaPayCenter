package com.hengaiw.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class MainController {
	@RequestMapping("main.html")
    public String mainTpl(ModelMap model) {
        return "admin/main";
    }
	
	@RequestMapping("console.html")
    public String consoleTpl(ModelMap model) {
        return "admin/console";
    }
	
	@RequestMapping("about.html")
    public String aboutTpl(ModelMap model) {
        return "admin/about";
    }
	
}
