package com.bank.account.service;

import java.util.List;

import com.bank.account.document.Account;


public interface AccountService {
	List<Account> getAccount();
	Account saveAccount(Account account);
	Account editAccount(Account account);
	boolean deletedAccount(String id);
}
