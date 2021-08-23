package com.learning.module;

public class Customer {


    private String password;
    private int bankAccountNo;
    private int balance;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Customer(String password, int bankAccountNo) {
        this.password = password;
        this.bankAccountNo = bankAccountNo;
    }

    public Customer(String password, int bankAccountNo,int balance) {
        this.password = password;
        this.bankAccountNo = bankAccountNo;
        this.balance=balance;
    }


	
	  
}
