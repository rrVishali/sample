package com.portfolio.ViewTransaction.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.ViewTransaction.entity.Transaction;
@Repository
public interface TransactionDao extends CrudRepository<Transaction, String>{
  

}
