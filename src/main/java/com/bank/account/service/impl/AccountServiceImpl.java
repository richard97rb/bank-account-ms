package com.bank.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.account.document.Account;
import com.bank.account.repository.AccountRepository;
import com.bank.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;

	
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}

	public Account saveAccount(Account account) {
		return accountRepository.save(account);
	}

	public Account editAccount(Account account) {
		return accountRepository.save(account);
	}

	public boolean deletedAccount(String id) {
		boolean deleted = false;
		try {
			accountRepository.deleteById(id);
			deleted = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deleted;
	}

	public List<Account> searchByPersonId(String personId) {
		return accountRepository.findByPersonId(personId);
	}
}
