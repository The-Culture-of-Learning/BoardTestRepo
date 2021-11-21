package com.kaoni.theCulureOfLearning.lhwBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LhwBoardUrlController {
	
	@RequestMapping(value = "/lhwBoardMainPage.do")
	public String boardMainPage() {
		
		return "lhw/boardMainPage";
	}
}