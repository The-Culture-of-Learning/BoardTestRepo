package com.kaoni.theCulureOfLearning.lhwBoard.service;

import java.util.List;

import com.kaoni.theCulureOfLearning.domain.LhwPost;

public interface LhwBoardService {
	public void writePost(String title, String contents);
	
	public List<LhwPost> selectPostList();
}
