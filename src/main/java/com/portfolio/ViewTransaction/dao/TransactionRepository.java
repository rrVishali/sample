package com.portfolio.ViewTransaction.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.ViewTransaction.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}