package com.kaoni.theCulureOfLearning.login.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.kaoni.theCulureOfLearning.domain.Member;

@Mapper
public interface MemberMapper {
	public void join(Member memberVo);
	
	public String loginCheck(String id,String pass);
}
