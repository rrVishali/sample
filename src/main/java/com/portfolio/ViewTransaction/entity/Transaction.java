package com.portfolio.ViewTransaction.entity;

import java.util.Date;

@jakarta.persistence.Entity
public class Transaction {
    @jakarta.persistence.Id
    private String transaction_id;
    private String user_id;
    private String stock_id;
    private Date date_of_purchase;
    private Date date_of_sell;
    private String units;
    private String amount_paid;
    private String amount_received;
    private String transaction_type;
    private String profit_or_loss;

    // Getters and setters
    public String getTransactionID() {
        return transaction_id;
    }

    public void setTransactionID(String transactionID) {
        this.transaction_id = transactionID;
    }

    public String getUserId() {
        return user_id;
    }

    public void setUserId(String userId) {
        this.user_id = userId;
    }

    public String getStockId() {
        return stock_id;
    }

    public void setStockId(String stockId) {
        this.stock_id = stockId;
    }

    public Date getDateOfPurchase() {
        return date_of_purchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.date_of_purchase = dateOfPurchase;
    }

    public Date getDateOfSell() {
        return date_of_sell;
    }

    public void setDateOfSell(Date dateOfSell) {
        this.date_of_sell = dateOfSell;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getAmountPaid() {
        return amount_paid;
    }

    public void setAmountPaid(String amountPaid) {
        this.amount_paid = amountPaid;
    }

    public String getAmountReceived() {
        return amount_paid;
    }

    public void setAmountReceived(String amountReceived) {
        this.amount_paid = amountReceived;
    }

    public String getTransactionType() {
        return transaction_type;
    }

    public void setTransactionType(String transactionType) {
        this.transaction_type = transactionType;
    }

    public String getProfitOrLoss() {
        return profit_or_loss;
    }

    public void setProfitOrLoss(String profitOrLoss) {
        this.profit_or_loss = profitOrLoss;
    }
}