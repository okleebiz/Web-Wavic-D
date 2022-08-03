package com.Wavic.SysD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebWavicDController {
	@RequestMapping("/")
	public String welcome() {
		System.out.println("############welcome#################");
		return "index";
	}
	
	
	@RequestMapping("test")
	public String test() {
		System.out.println("##############test#################");
		return "test";
	}
}
