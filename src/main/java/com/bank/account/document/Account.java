package com.bank.account.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class Account {
	
	@Id
	private String id;
	private String accountType;
	private String accountName;
	private String currency;
	private float initialSAmount;
	private float currentAmount;
	private boolean isActive;
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public float getInitialSAmount() {
		return initialSAmount;
	}
	public void setInitialSAmount(float initialSAmount) {
		this.initialSAmount = initialSAmount;
	}
	public float getCurrentAmount() {
		return currentAmount;
	}
	public void setCurrentAmount(float currentAmount) {
		this.currentAmount = currentAmount;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Account(String id, String accountType, String accountName, String currency, float initialSAmount,
			float currentAmount, boolean isActive) {
		super();
		this.id = id;
		this.accountType = accountType;
		this.accountName = accountName;
		this.currency = currency;
		this.initialSAmount = 0.0f;
		this.currentAmount = currentAmount;
		this.isActive = isActive;
	}
	
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", accountType=" + accountType + ", accountName=" + accountName + ", currency="
				+ currency + ", initialSAmount=" + initialSAmount + ", currentAmount=" + currentAmount + ", isActive="
				+ isActive + "]";
	}	
}
