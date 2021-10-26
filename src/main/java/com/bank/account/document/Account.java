package com.bank.account.document;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "account")
public class Account {
	
	@Id
	private String id;
	private String personId;
	private String accountType;
	private String accountNumber;
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
	public String getPersonId() {
		return personId;
	}
	public void setPersonId(String personId) {
		this.personId = personId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
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
	public Account(String id, String personId, String accountType, String accountNumber, String currency,
			float initialSAmount, float currentAmount, boolean isActive) {
		super();
		this.id = id;
		this.personId = personId;
		this.accountType = accountType;
		this.accountNumber = accountNumber;
		this.currency = currency;
		this.initialSAmount = initialSAmount;
		this.currentAmount = currentAmount;
		this.isActive = isActive;
	}
	public Account() {
		super();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", personId=" + personId + ", accountType=" + accountType + ", accountNumber="
				+ accountNumber + ", currency=" + currency + ", initialSAmount=" + initialSAmount + ", currentAmount="
				+ currentAmount + ", isActive=" + isActive + "]";
	}
	
}
