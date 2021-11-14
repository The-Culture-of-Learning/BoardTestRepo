package com.kaoni.theCulureOfLearning.login.controller;

import com.kaoni.theCulureOfLearning.domain.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginUrlController {

	private static final Logger logger = LoggerFactory.getLogger(LoginUrlController.class);

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}


	@RequestMapping(value = "loginPage.do", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String login(@RequestBody Member member) {
		logger.info("member : {}", member);
		return "mainPage";
	}

}
