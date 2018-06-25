package com.jgoodie;

public class Main {

    public static void main(String[] args) {

        vipCustomer defaultVip = new vipCustomer();
        System.out.println(defaultVip.getCustomerName());
        System.out.println(defaultVip.getEmailAddress());
        System.out.println(defaultVip.getCreditLimit());
        vipCustomer noEmailVip = new vipCustomer("Mary", 1000.00);
        System.out.println(noEmailVip.getCustomerName());
        System.out.println(noEmailVip.getEmailAddress());
        System.out.println(noEmailVip.getCreditLimit());
        vipCustomer customerVip = new vipCustomer("Liz",5000.00, "liz@email.com");
        System.out.println(customerVip.getCustomerName());
        System.out.println(customerVip.getEmailAddress());
        System.out.println(customerVip.getCreditLimit());
        //BankAccount myAccount = new BankAccount("000042", 1234.00, "Bob Robertson", "bob@bob.com", "555-123-1234");
	    //BankAccount defaultConstructorAcct = new BankAccount();
//	    BankAccount bobsAccount = new BankAccount("bob", "bob@email.com", "555-111-2222");
//        System.out.println(bobsAccount.getCustomerName());
//        System.out.println(bobsAccount.getEmailAddr());
//        System.out.println(bobsAccount.getPhoneNumber());
//        System.out.println(bobsAccount.getAcctNumber());
//        System.out.println(bobsAccount.getBalance());
	    //myAccount.setAcctNumber("000042");
	    //myAccount.setCustomerName("Arthur Philip Dent");
	    //myAccount.setEmailAddr("arthur.dent@gmail.com");
	    //myAccount.setPhoneNumber("555-123-4567");
	    //myAccount.setBalance(1234500.99);
//        ystem.out.println(myAccount.getAcctNumber());
//        System.out.println(myAccount.getCustomerName());
//        System.out.println(myAccount.getEmailAddr());
//        System.out.println(myAccount.getPhoneNumber());
//        System.out.println(myAccount.getBalance());
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
