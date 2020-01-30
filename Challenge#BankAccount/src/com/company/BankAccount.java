package com.company;

public class BankAccount {
    private int accountNumber, phoneNumber;
    private double balance;
    private String customerName, email;

    public BankAccount(int accountNumber, String customerName, int phone, String email, double balance)
    {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.balance = balance;
        this.phoneNumber = phone ;
    }
    public BankAccount()
    {
        this(0, "default", 0000000, "default@default.com", 0.00);
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Your new balance is: " + this.getBalance());
        } else
            System.out.println("Invalid amount. Cannot deposit.");
    }

    public void withdraw(double amount)
    {
        if((balance - amount) < 0) {
            System.out.println("Insufficient Funds \n Current Balance: " + this.getBalance());
        } else {
            this.balance -= amount;
            System.out.println("Your new balance is: " + this.getBalance());
        }
    }
}
