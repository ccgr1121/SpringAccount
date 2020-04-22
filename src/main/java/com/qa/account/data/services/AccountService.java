package com.qa.account.data.services;

import org.springframework.stereotype.Service;

import com.qa.account.data.domain.Account;
import com.qa.account.data.repo.AccountRepo;

@Service
public class AccountService {

	private AccountRepo repo;
	
	public AccountService(AccountRepo repo) {
		this.repo = repo;
	}
	
	public Account create(Account account) {
		return this.repo.save(account);
	}
	
	
}
