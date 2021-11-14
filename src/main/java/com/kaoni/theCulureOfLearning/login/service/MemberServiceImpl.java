package com.kaoni.theCulureOfLearning.login.service;

import java.sql.Date;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kaoni.theCulureOfLearning.domain.Member;
import com.kaoni.theCulureOfLearning.login.mapper.MemberMapper;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper memberMapper;

	@Override
	public void join(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");

		Member memberVo = new Member();
		memberVo.setId(id);
		memberVo.setPass(pw);
		memberVo.setName(name);

		memberMapper.join(memberVo);

	}

	@Override
	public HashMap<String, Object> login() {
		// TODO Auto-generated method stub
		return null;
	}

}
