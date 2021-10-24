package com.bank.account.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bank.account.document.Account;

@Repository
public interface AccountRepository extends MongoRepository<Account, String> {

}