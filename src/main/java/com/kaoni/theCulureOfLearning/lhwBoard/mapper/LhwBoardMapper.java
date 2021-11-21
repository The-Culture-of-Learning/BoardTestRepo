package com.kaoni.theCulureOfLearning.lhwBoard.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kaoni.theCulureOfLearning.domain.LhwPost;


@Mapper
public interface LhwBoardMapper {
	
	public void writePost(String title, String contents);
	
	public List<LhwPost> selectPostList();
}
