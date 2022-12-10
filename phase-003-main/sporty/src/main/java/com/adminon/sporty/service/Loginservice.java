package com.adminon.sporty.service;

import java.util.List;

import com.adminon.sporty.entity.Login;

public interface Loginservice {
	 List<Login> getAlllogin();
		Login getLoginById(Long id);
		Login updateLog(Login login);
}
