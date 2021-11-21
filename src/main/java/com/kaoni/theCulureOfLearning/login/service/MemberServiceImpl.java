package com.kaoni.theCulureOfLearning.login.service;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaoni.theCulureOfLearning.domain.Member;
import com.kaoni.theCulureOfLearning.login.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public void join(Member memberVo) {

		memberMapper.join(memberVo);

	}

	@Override
	public String loginCheck(String id , String pass) {
		String loginCheck = memberMapper.loginCheck(id, pass);
		
		if (loginCheck == null) {
			loginCheck = "fail";
		}
		
		return loginCheck;
	}

	@Override
	public HashMap<String, Object> login() {
		// TODO Auto-generated method stub
		return null;
	}

}
