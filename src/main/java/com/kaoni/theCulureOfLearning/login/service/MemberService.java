package com.kaoni.theCulureOfLearning.login.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public interface MemberService {
	public int join();
	public HashMap<String, Object> login();
}
