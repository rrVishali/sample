package com.portfolio.ViewTransaction.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Transaction")
public class Transaction {
   
    @Id
    private String transactionID;
    private String userId;
    private String stockId;
    private String dateOfPurchase;
    private String dateOfSell;
    private int units;
    private double amountPaid;
    private double amountReceived;
    private String transactionType;


    public Transaction() {
        // Default constructor required by Spring Data Redis
    }

    public Transaction(String transactionID, String userId, String stockId, int units, double amountPaid,double amountReceived, String dateOfPurchase, String dateOfSell, String transactionType) {
        this.transactionID = transactionID;
        this.userId = userId;
        this.stockId = stockId;
        this.dateOfPurchase = dateOfPurchase;
        this.dateOfSell = dateOfSell;
        this.units = units;
        this.amountPaid = amountPaid;
        this.amountReceived = amountReceived;
        this.transactionType= transactionType;
    }

    public String getTransactionId() {
        return transactionID;
    }

    public void setTransactionId(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }
    public String getdateOfPurchase() {
        return dateOfPurchase;
    }

    public void setdateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
    public String getdateOfSell() {
        return dateOfSell;
    }

    public void setdateOfSell(String dateOfSell) {
        this.dateOfSell = dateOfSell;
    }
    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public double getamountPaid() {
        return amountPaid;
    }

    public void setamountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
    public double getamountReceived() {
        return amountReceived;
    }

    public void setamountReceived(double amountReceived) {
        this.amountReceived = amountReceived;
    }
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionID + '\'' +
                ", userId='" + userId + '\'' +
                ", Units ='" + units + '\'' +
                ", Amount Paid=" + amountPaid +
                ", Amount received =" + amountReceived +
                ",Date of Purchase =" + dateOfPurchase +
                ", Date of Selling =" + dateOfSell +
                ", Transaction type =" + transactionType +
                ", stock ID =" + stockId +
                '}';
    }
}
