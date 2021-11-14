package com.kaoni.theCulureOfLearning.login.service;

import java.util.HashMap;

public interface MemberService {
	public int join(String param);
	public HashMap<String, Object> login();
}
