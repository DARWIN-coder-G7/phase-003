package com.bankback.online.service;

import com.bankback.online.entity.AccountData;

public interface AccountService {

	//to update account
	AccountData saveaccount(AccountData accdata,long id);
	//to create account
	AccountData newacc(AccountData accdata);
}
