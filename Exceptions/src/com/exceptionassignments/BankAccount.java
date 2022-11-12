package com.exceptionassignments;

public class BankAccount {
	private double balance;
    public BankAccount()
    {
        balance = 10000;
    }
    public BankAccount (double initialBalance)
    {
        balance = initialBalance;
    }
    public void deposit(double amount)
    {
        balance = balance + amount;
    }
    public void withdraw(double amount)
    {
        if(amount>balance)
        {
            throw new IllegalArgumentException("InsufficientBalanceException");
        }
        balance = balance - amount;
    }
    public double getBalance()
    {
        return balance;

}
}
