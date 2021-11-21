package com.kaoni.theCulureOfLearning.login.controller;

import com.kaoni.theCulureOfLearning.domain.Member;
import com.kaoni.theCulureOfLearning.login.service.MemberService;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginUrlController {

	private static final Logger logger = LoggerFactory.getLogger(LoginUrlController.class);

	@Autowired
	MemberService memberService;

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}

	@RequestMapping(value = "loginPage.do")
	public String login(HttpSession session, @RequestParam String id, @RequestParam String pass, Model model) {

		String loginCheck = memberService.loginCheck(id, pass);

		if ("fail".equals(loginCheck)) {
			return "index";
		} else {
			model.addAttribute("userName", loginCheck);
			return "mainPage";
		}

	}

}
