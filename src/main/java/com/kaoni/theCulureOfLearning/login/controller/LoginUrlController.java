package com.kaoni.theCulureOfLearning.login.controller;

import com.kaoni.theCulureOfLearning.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginUrlController {
	
	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "loginPage.do")
	public String login(@RequestBody Member member) {

		return "mainPage";
	}

}
