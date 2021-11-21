package com.kaoni.theCulureOfLearning.lhwBoard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kaoni.theCulureOfLearning.domain.LhwPost;
import com.kaoni.theCulureOfLearning.lhwBoard.service.LhwBoardService;

@Controller
public class LhwBoardUrlController {

	@Autowired
	LhwBoardService boardService;

	@RequestMapping(value = "lhwBoardMainPage.do")
	public String mainPage(Model model) {
		List<LhwPost> list = boardService.selectPostList();

		model.addAttribute("list", list);

		return "lhw/boardMainPage";
	}

	@RequestMapping(value = "lhwBoardWritePost.do")
	public String writePost(@RequestParam(value = "title") String title,
			@RequestParam(value = "contents") String contents, Model model) {
		boardService.writePost(title, contents);
		
		List<LhwPost> list = boardService.selectPostList();

		model.addAttribute("list", list);
		return "lhw/boardMainPage";
	}

	@RequestMapping(value = "lhwBoardWritePage.do")
	public String writePage() {
		return "lhw/boardWritePage";
	}
}