package com.portfolio.ViewTransaction.service;

import java.util.List;

import com.portfolio.ViewTransaction.entity.Transaction;

public interface TransactionService {
    List<Transaction> getAllTransactions();

    Transaction saveTransaction(Transaction transaction);
}