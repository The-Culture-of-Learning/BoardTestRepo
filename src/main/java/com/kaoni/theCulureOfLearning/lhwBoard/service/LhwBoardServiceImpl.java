package com.kaoni.theCulureOfLearning.lhwBoard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaoni.theCulureOfLearning.lhwBoard.mapper.LhwBoardMapper;

@Service
public class LhwBoardServiceImpl implements LhwBoardService {

	@Autowired
	LhwBoardMapper boardMapper;

	public void writePost(String title, String contents) {
		boardMapper.writePost(title, contents);

	}
}
