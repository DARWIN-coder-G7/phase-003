package com.bankback.online.service.impl;

import org.springframework.stereotype.Service;

import com.bankback.online.entity.AccountData;
import com.bankback.online.repository.AccountRepo;
import com.bankback.online.service.AccountService;

@Service
public class Accserviceimpl implements AccountService {
  
	public Accserviceimpl(AccountRepo accrepo) {
		super();
		this.accrepo = accrepo;
	}

	private AccountRepo accrepo;
	@Override
	public AccountData saveaccount(AccountData accdata,long id) {
		// TODO Auto-generated method stub
		AccountData existingdata = accrepo.findById(id).orElseThrow();
		existingdata.setWithdrawal(accdata.isWithdrawal());
		existingdata.setChequebook(accdata.isChequebook());
		existingdata.setDeposit(accdata.isDeposit());
		existingdata.setMoneytransfer(accdata.isMoneytransfer());
		accrepo.save(existingdata);
		return existingdata;
	}

	@Override
	public AccountData newacc(AccountData accdata) {
		// TODO Auto-generated method stub
		accrepo.save(accdata);
		return accdata;
		
	}

}
