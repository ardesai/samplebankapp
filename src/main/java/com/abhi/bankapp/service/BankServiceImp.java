package com.abhi.bankapp.service;

import org.springframework.stereotype.Component;

import com.abhi.bankapp.domain.*;

@Component
public class BankServiceImp implements BankService{
	
	@Override
	public Account getAccount(String userId, String accountNumber){
		Account account = new Account(123456789, 987654321);
		return account;
	}

	@Override
	public void addUser(User user) {
		System.out.println("Creating user: " + user.toString());
	}

}
