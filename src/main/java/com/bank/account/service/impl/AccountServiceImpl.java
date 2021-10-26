package com.bank.account.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.aggregation.ConditionalOperators.Switch;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bank.account.constant.AccountType;
import com.bank.account.document.Account;
import com.bank.account.repository.AccountRepository;
import com.bank.account.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;
	@Value("${api.people.endpoint}")
	private String personEndpoint;
	
	public List<Account> getAccounts() {
		return accountRepository.findAll();
	}

	public Account saveAccount(Account account) {
		RestTemplate restTemplate = new RestTemplate();
	    String result = restTemplate.getForObject(personEndpoint, String.class, account.getPersonId());
	    System.out.println(result);
		if(account.getAccountType().equals(AccountType.CUENTA_AHORRO.toString())){
			
		} else if(account.getAccountType().equals(AccountType.CUENTA_CORRIENTE.toString())){
			
		} else if(account.getAccountType().equals(AccountType.PLAZO_FIJO.toString())){
			
		}
		
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
