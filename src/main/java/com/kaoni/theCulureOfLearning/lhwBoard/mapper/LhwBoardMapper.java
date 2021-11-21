package com.kaoni.theCulureOfLearning.lhwBoard.mapper;

import java.util.HashMap;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LhwBoardMapper {
	public void writePost(String title, String contents);

}
