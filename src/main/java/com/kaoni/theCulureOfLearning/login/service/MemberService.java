package com.kaoni.theCulureOfLearning.login.service;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {
	public void join(HttpServletRequest request);

	public HashMap<String, Object> login();
}
