package com.abhi.bankapp.service;

import com.abhi.bankapp.domain.*;

public interface BankService {
	
	public Account getAccount(String userId, String accountNumber);
	
	public void addUser(User user);

}
