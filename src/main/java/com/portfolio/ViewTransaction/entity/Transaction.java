package com.portfolio.ViewTransaction.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import java.io.Serializable;
import java.util.Date;

@RedisHash("Transaction")
public class Transaction implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    private String transactionID;
    private String userId;
    private String stockId;
     private Date dateOfPurchase;
    private Date dateOfSell;
    private String units;
    private String amountPaid;
    private String amountReceived;
    private String transactionType;
    private String profitOrLoss;


    public Transaction() {
        // Default constructor required by Spring Data Redis
    }

    public Transaction(String transactionID, String userId, String stockId, String units, Date dateOfPurchase, Date dateOfSell, String amountPaid,String amountReceived, String transactionType, String profitOrLoss) {
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
    
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getamountPaid() {
        return amountPaid;
    }

    public void setamountPaid(String amountPaid) {
        this.amountPaid = amountPaid;
    }
    public String getamountReceived() {
        return amountReceived;
    }

    public void setamountReceived(String amountReceived) {
        this.amountReceived = amountReceived;
    }
    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public String getProfitOrLoss() {
        return profitOrLoss;
    }

    public void setProfitOrLoss(String profitOrLoss) {
        this.profitOrLoss = profitOrLoss;
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

    public void setProfitOrLoss(double profitOrLoss2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setProfitOrLoss'");
    }
}
