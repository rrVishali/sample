package com.portfolio.ViewTransaction.service;

import java.util.List;

import com.portfolio.ViewTransaction.entity.Transaction;

public interface TransactionService {
    void saveTransaction(Transaction transaction);

   Transaction getTransactionById(String transactionIDString);

    void updateTransaction(Transaction transaction);

    List<Transaction> getAllTransactions();

    
}