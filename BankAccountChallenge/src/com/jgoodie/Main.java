package com.jgoodie;

public class Main {

    public static void main(String[] args) {
	    BankAccount myAccount = new BankAccount("000042", 1234.00, "Bob Robertson", "bob@bob.com", "555-123-1234");
	    BankAccount defaultConstructorAcct = new BankAccount();
	    //myAccount.setAcctNumber("000042");
	    //myAccount.setCustomerName("Arthur Philip Dent");
	    //myAccount.setEmailAddr("arthur.dent@gmail.com");
	    //myAccount.setPhoneNumber("555-123-4567");
	    //myAccount.setBalance(1234500.99);
        System.out.println(myAccount.getAcctNumber());
        System.out.println(myAccount.getCustomerName());
        System.out.println(myAccount.getEmailAddr());
        System.out.println(myAccount.getPhoneNumber());
        System.out.println(myAccount.getBalance());
//        myAccount.withdrawlFunds(5000.00);
//        System.out.println(myAccount.getBalance());
//        myAccount.depositFunds(0.01);
//        System.out.println(myAccount.getBalance());
//        myAccount.withdrawlFunds(1229501.00);
//        System.out.println(myAccount.getBalance());
//        myAccount.depositFunds(1000.00);
//        System.out.println(myAccount.getBalance());
//        System.out.println(myAccount.getBalance());
//        myAccount.withdrawlFunds(1229501.00);
    }

}
