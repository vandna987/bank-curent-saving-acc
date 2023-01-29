package com.monocept.model;

public class CurrentAccount extends Account {
	private static final int OVER_DRAFT = 20000;

	public CurrentAccount(int accountNumber, String name, double amount) {
		super(accountNumber, name, amount);

	}

	@Override
	public void withdraw(double amount) {

		if (this.getBalance() - amount >= -OVER_DRAFT) {
			this.setBalance(this.getBalance() - amount);
			return;
		}

		System.out.println("Insufficient balance");
	}

}
