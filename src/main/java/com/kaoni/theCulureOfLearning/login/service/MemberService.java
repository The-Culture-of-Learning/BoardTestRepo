package com.kaoni.theCulureOfLearning.login.service;

import java.util.HashMap;


import com.kaoni.theCulureOfLearning.domain.Member;

public interface MemberService {
	public int join(Member memberVo);
	public HashMap<String, Object> login();
}
