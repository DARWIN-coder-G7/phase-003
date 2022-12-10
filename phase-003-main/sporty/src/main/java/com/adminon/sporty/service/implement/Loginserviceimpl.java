package com.adminon.sporty.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import com.adminon.sporty.entity.Login;
import com.adminon.sporty.repository.Loginrepo;
import com.adminon.sporty.service.Loginservice;
@Service
public class Loginserviceimpl  implements Loginservice{
public Loginserviceimpl(Loginrepo logrep) {
		super();
		this.logrep = logrep;
	}

private Loginrepo logrep;
	@Override
	public List<Login> getAlllogin() {
		// TODO Auto-generated method stub
		return logrep.findAll();
	}

	@Override
	public Login getLoginById(Long id) {
		// TODO Auto-generated method stub
		return logrep.findById(id).get();
	}

	@Override
	public Login updateLog(Login login) {
		// TODO Auto-generated method stub
		return logrep.save(login);
	}

}
