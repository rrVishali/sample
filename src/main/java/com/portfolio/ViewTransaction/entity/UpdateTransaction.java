// package com.portfolio.ViewTransaction.entity;

// import org.springframework.data.redis.core.RedisHash;

// @RedisHash("UpdateTransaction")
// public class UpdateTransaction {
//     @Id
//     private String transactionID;
//     private String userId;
//     private String stockId;
//     private String transactionType;
//     private String ProfitORLoss;

    
//     public UpdateTransaction() {
//         // Default constructor required by Spring Data Redis
//     }
    
//     public UpdateTransaction(String transactionId, String userId, String stockId,String transactionType, String ProfitORLoss) {
//         this.transactionID = transactionId;
//         this.userId = userId;
//         this.stockId = stockId;
//         this.transactionType= transactionType;
//         this.ProfitORLoss=ProfitORLoss;
//     }
//     public String getTransactionId() {
//         return transactionID;
//     }

//     public void setTransactionId(String transactionId) {
//         this.transactionID = transactionId;
//     }

//     public String getUserId() {
//         return userId;
//     }

//     public void setUserId(String userId) {
//         this.userId = userId;
//     }

//     public String getStockId() {
//         return stockId;
//     }

//     public void setStockId(String stockId) {
//         this.stockId = stockId;
//     }
//     public String getTransactionType() {
//         return transactionType;
//     }

//     public void setTransactionType(String transactionType) {
//         this.transactionType = transactionType;
//     }
// }
