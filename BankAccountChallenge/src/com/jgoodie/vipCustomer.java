package com.jgoodie;

public class vipCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public vipCustomer(){
        this("Default Name", 0.00, "default.email@xyz.net");
    }

    public vipCustomer(String customerName, double creditLimit){
        this(customerName, creditLimit, "default.email@xyz.net");
        //this.customerName = customerName;
        //this.creditLimit = creditLimit;
        //this.emailAddress = "default.email@xyz.net";
    }

    public vipCustomer(String customerName, double creditLimit, String emailAddress){
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }
}
