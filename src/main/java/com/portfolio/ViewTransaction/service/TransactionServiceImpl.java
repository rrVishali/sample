package com.portfolio.ViewTransaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.portfolio.ViewTransaction.dao.TransactionRepository;
import com.portfolio.ViewTransaction.entity.Transaction;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    @Override
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    public Transaction saveTransaction(Transaction transaction) {
        // Calculate profit or loss
        Double amount_paid = Double.parseDouble(transaction.getAmountPaid());
        Double amount_received = Double.parseDouble(transaction.getAmountReceived());
        Double profit_or_loss = amount_paid - amount_received;
        transaction.setProfitOrLoss(String.valueOf(profit_or_loss));

        // Save transaction
        return transactionRepository.save(transaction);
    }
}