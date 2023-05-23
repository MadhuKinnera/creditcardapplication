package com.clayfin.service;

import java.time.LocalDateTime;
import java.util.List;

import com.clayfin.exception.CreditCardException;
import com.clayfin.exception.LoginException;
import com.clayfin.exception.TimeException;
import com.clayfin.exception.TransactionException;
import com.clayfin.model.Transaction;
import com.clayfin.model.TransactionType;

public interface UserService {

	String login(String email) throws LoginException;

	Transaction makeTransaction(Integer amount,TransactionType transactionType) throws LoginException, TransactionException, CreditCardException;

	List<Transaction> viewTransactions() throws LoginException, TransactionException;

	//Transaction makeRepayment(Integer amount) throws LoginException, TransactionException;

	LocalDateTime timeTravel(Integer days) throws LoginException, TransactionException, TimeException;

}
