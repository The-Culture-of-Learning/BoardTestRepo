package com.kaoni.theCulureOfLearning.login.service;

import java.util.HashMap;

import com.kaoni.theCulureOfLearning.domain.Member;

public interface MemberService {
	public void join(Member request);

	public HashMap<String, Object> login();

	public String loginCheck(String id, String pass);
}
