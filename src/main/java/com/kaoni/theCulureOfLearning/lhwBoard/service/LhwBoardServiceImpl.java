package com.kaoni.theCulureOfLearning.lhwBoard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaoni.theCulureOfLearning.domain.LhwPost;
import com.kaoni.theCulureOfLearning.lhwBoard.mapper.LhwBoardMapper;

@Service
public class LhwBoardServiceImpl implements LhwBoardService {

	@Autowired
	LhwBoardMapper boardMapper;
	
	@Override
	public void writePost(String title, String contents) {
		boardMapper.writePost(title, contents);

	}
	

	@Override
	public List<LhwPost> selectPostList() {
		return boardMapper.selectPostList();
	}
}
