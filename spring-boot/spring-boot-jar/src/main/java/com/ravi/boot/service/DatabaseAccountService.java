package com.ravi.boot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.ravi.boot.dao.AccountRepository;

@Service
public class DatabaseAccountService implements AccountService {
	
	private final AccountRepository accountRepository;

	@Autowired
	public DatabaseAccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
}