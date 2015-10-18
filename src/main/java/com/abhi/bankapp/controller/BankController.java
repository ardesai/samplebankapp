package com.abhi.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abhi.bankapp.domain.Account;
import com.abhi.bankapp.domain.User;
import com.abhi.bankapp.service.BankService;

@RestController
@RequestMapping("/bankapp")
public class BankController {
	
	@Autowired
	private BankService service;
    
    @RequestMapping("/hello")
    public String hello() {
        return "Greetings from Bank app!!";
    }
    
    @RequestMapping("/users/{userId}/accounts/{accountId}")
    public Account readAccount(@PathVariable String userId, @PathVariable String accountId){
    	return service.getAccount(userId, accountId);
    }
    
    @RequestMapping(value="/user", method=RequestMethod.POST)
    public void addUser(@RequestBody User user){
    	service.addUser(user);
    }
    
}
