package com.bankback.online.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankback.online.entity.AccountData;
import com.bankback.online.service.AccountService;


@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/acc")
public class Accountcontroller {
 
	public Accountcontroller(AccountService accserv) {
		super();
		this.accserv = accserv;
	}

	private AccountService accserv;
	
	//to create acc
	@PostMapping()
	public ResponseEntity<AccountData> createacc(@RequestBody AccountData accdata){
		
		return new ResponseEntity<AccountData>(accserv.newacc(accdata),HttpStatus.CREATED);
	}
	//http://localhost:8080/api/acc/1
	@PutMapping("{id}")
	public ResponseEntity<AccountData> updateProducts(@PathVariable("id") long id
			  ,@RequestBody AccountData products){
		return new ResponseEntity<AccountData>(accserv.saveaccount(products, id),HttpStatus.OK);
	}
	
}
