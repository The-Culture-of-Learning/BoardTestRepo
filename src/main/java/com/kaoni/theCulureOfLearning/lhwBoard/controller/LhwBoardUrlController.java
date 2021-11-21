package com.kaoni.theCulureOfLearning.lhwBoard.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kaoni.theCulureOfLearning.lhwBoard.service.LhwBoardService;

@Controller
public class LhwBoardUrlController {

	@Autowired
	LhwBoardService boardService;

	@RequestMapping(value = "lhwBoardMainPage.do")
	public String mainPage() {

		return "lhw/boardMainPage";
	}

	@RequestMapping(value = "lhwBoardWritePost.do")
	public String writePost(@RequestParam(value = "title") String title,
			@RequestParam(value = "contents") String contents) {
		boardService.writePost(title, contents);
		
		return "lhw/boardMainPage";
	}

	@RequestMapping(value = "lhwBoardWritePage.do")
	public String writePage() {
		return "lhw/boardWritePage";
	}
}