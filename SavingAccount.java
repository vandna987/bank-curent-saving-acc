package com.monocept.model;

public class SavingAccount extends Account {
	private static final int MIN_BALANCE = 1000;

	public SavingAccount(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);

	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if (this.getBalance() - amount > MIN_BALANCE) {
			this.setBalance(this.getBalance() - amount);
			return;
		}

		System.out.println("insufficient balance");
	}

}
