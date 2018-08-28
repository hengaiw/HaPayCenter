package com.hengaiw.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/main")
public class MainController {
	@RequestMapping("")
    public String mainTpl(ModelMap model) {
        return "admin/main";
    }
	
	
}
