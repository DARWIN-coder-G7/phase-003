package com.adminon.sporty.service;

import java.util.List;
import com.adminon.sporty.entity.UserDetails;

public interface Userservice {
	 List<UserDetails> getAllUsers();
		
		UserDetails saveUserDetails(UserDetails userdetails);
		
		UserDetails getUserDetailsById(Long id);
		List <UserDetails> getbykeyword(String keyword);
}
