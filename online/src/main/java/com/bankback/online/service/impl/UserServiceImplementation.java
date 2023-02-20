package com.bankback.online.service.impl;

import org.springframework.stereotype.Service;

import com.bankback.online.entity.User;
import com.bankback.online.exception.ResourceNotFoundException;
import com.bankback.online.repository.UserRepository;
import com.bankback.online.service.UserService;

@Service
public class UserServiceImplementation implements UserService {
 
	public UserServiceImplementation(UserRepository userepo) {
		super();
		this.userepo = userepo;
	}

	private UserRepository userepo;
	@Override
	public User saveUser(User userdata) {
		// TODO Auto-generated method stub
		return userepo.save(userdata);
	}

	@Override
	public User getUserById(long id) {
		// TODO Auto-generated method stub
		return userepo.findById(id).orElseThrow(() -> 
        new ResourceNotFoundException("UserData","id",id));
	}

	@Override
	public User checkuser(String username, String pass) {
		// TODO Auto-generated method stub
		return userepo.logincheck(username, pass);
	}

}
