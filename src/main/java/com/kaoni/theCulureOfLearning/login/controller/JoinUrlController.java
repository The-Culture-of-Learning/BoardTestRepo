package com.kaoni.theCulureOfLearning.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kaoni.theCulureOfLearning.domain.Member;
import com.kaoni.theCulureOfLearning.login.service.MemberService;

@Controller
public class JoinUrlController {

	@Autowired
	MemberService memberService;

	@RequestMapping(value = "joinPage.do")
	public String join(Member memberVo) {
		memberService.join(memberVo);

		return "index";

	}
}
