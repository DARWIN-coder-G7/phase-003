package com.adminon.sporty.service.implement;
import java.util.List;

import org.springframework.stereotype.Service;
import com.adminon.sporty.entity.UserDetails;
import com.adminon.sporty.repository.UserDetailsRepo;
import com.adminon.sporty.service.Userservice;
@Service
public class UserserviceImpl implements Userservice {

	public UserserviceImpl(UserDetailsRepo ud) {
		super();
		this.ud = ud;
	}

	private UserDetailsRepo ud;
	@Override
	public List<UserDetails> getAllUsers() {
		// TODO Auto-generated method stub
		return ud.findAll();
	}

	@Override
	public UserDetails saveUserDetails(UserDetails userdetails) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails getUserDetailsById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserDetails> getbykeyword(String keyword) {
		// TODO Auto-generated method stub
		return ud.findbykeyword(keyword);
	}

}
