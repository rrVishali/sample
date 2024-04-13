package com.portfolio.ViewTransaction.service;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.portfolio.ViewTransaction.entity.Transaction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TransactionServiceImpl implements TransactionService {
    private final RedisTemplate<String, Transaction> redisTemplate;
    @Autowired
    public TransactionServiceImpl(RedisTemplate<String, Transaction> redisTemplate) {
        this.redisTemplate = redisTemplate;
    }

   

     @Override
     public Transaction getTransactionById(String transactionID) {
        return (Transaction) redisTemplate.opsForHash().get("Transaction", transactionID);
     }

    
    @Override
    public void updateTransaction(Transaction transaction) {
        redisTemplate.opsForHash().put("Transaction", transaction.getTransactionId(), transaction);
    }

   
    public void saveTransaction(Transaction transaction) {
        redisTemplate.opsForHash().put("Transaction", transaction.getTransactionId(), transaction);
    }



    @Override
    public List<Transaction> getAllTransactions() {
        Map<Object, Object> transactionsMap = redisTemplate.opsForHash().entries("Transaction");
        return transactionsMap.values().stream()
                .map(transaction -> (Transaction) transaction)
                .collect(Collectors.toList());
    }

}

