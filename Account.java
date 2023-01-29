package com.monocept.model;

public abstract class Account {

	private int accountNumber;
	private String name;
	private double balance;

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(int accountNumber, String name, double balance) {

		this.accountNumber = accountNumber;
		this.name = name;
		this.balance = balance;

	}

	public Account(int accountNumber, String name) {

		this(accountNumber, name, 500);
		// totalAccount++;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void deposite(double amount) {
		this.balance = this.balance + amount;
	}

	abstract public void withdraw(double amount);

}
