package com.jgoodie;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BankAccount {
    private String acctNumber;
    private double balance;
    private String customerName;
    private String emailAddr;
    private String phoneNumber;

    // create a constructor
    public BankAccount(){
        // can a constructor from another constructor
        // this has to be first
        this("56789", 2.50, "Default name", "Default@address", "000-000-0000" );
        System.out.println("empty constructor called");
    }

    public BankAccount(String acctNumber, double balance, String customerName, String emailAddr, String phoneNumber) {
        this.acctNumber = acctNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.emailAddr = emailAddr;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String customerName, String emailAddr, String phoneNumber) {
        this("99999",0.00, customerName,emailAddr,phoneNumber);
    }

    public void depositFunds(double depositAmount){
        if(depositAmount < 0){
            System.out.println("Invalid Amount");
        }
        this.balance += depositAmount;
    }

    public void withdrawlFunds(double withdrawlAmount){
        if(withdrawlAmount > this.balance){
            System.out.println("Insufficient funds!");
        }
        else {
            this.balance -= withdrawlAmount;
        }
    }

    public void setAcctNumber(String acctNumber){
        this.acctNumber = acctNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAcctNumber() {
        return this.acctNumber;
    }

    public double getBalance() {
        BigDecimal bd = new BigDecimal(this.balance);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmailAddr() {
        return this.emailAddr;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
