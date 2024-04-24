package com.portfolio.ViewTransaction.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.portfolio.ViewTransaction.entity.Transaction;
import com.portfolio.ViewTransaction.service.TransactionService;

@RestController
@RequestMapping("/Transaction")

public class TransactionController {
      
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    
   
    @GetMapping("/gettransactions")
public ResponseEntity<?> getAllTransactions() {
    // Retrieve all transactions from the Redis database
    try {
        // Retrieve all transactions from the Redis database
        List<Transaction> transactions = transactionService.getAllTransactions();
        return new ResponseEntity<>(transactions, HttpStatus.OK);
    } catch (Exception e) {
        // Handle any exceptions and return an error response
        return new ResponseEntity<>("Error retrieving transactions: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
@GetMapping("/{transactionID}")
public ResponseEntity<?> getTransactionById(@PathVariable String transactionID) {
    Transaction transaction = transactionService.getTransactionById(transactionID);
    return transaction != null ?
            new ResponseEntity<>(transaction, HttpStatus.OK) :
            new ResponseEntity<>("Transaction not found", HttpStatus.NOT_FOUND);
}
    
    
@PutMapping("/{transactionId}")
public ResponseEntity<String> updateTransaction(@PathVariable String transactionId) {
    Transaction transaction = transactionService.getTransactionById(transactionId);
    if (transaction == null) {
        return ResponseEntity.notFound().build();
    }

    // Calculate profit or loss
    double amountReceived = Double.parseDouble(transaction.getamountReceived());
    double amountPaid = Double.parseDouble(transaction.getamountPaid());
    double profitOrLoss = amountReceived - amountPaid;

    // Update transaction with profit or loss value
    transaction.setProfitOrLoss(profitOrLoss);

    // Update the transaction
    transactionService.updateTransaction(transaction);

    return ResponseEntity.ok("Transaction updated successfully with profit/loss: " + profitOrLoss);
}


    

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<?> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<String> errors = ex.getBindingResult().getAllErrors().stream()
                .map(error -> error.getDefaultMessage())
                .collect(Collectors.toList());
        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}
