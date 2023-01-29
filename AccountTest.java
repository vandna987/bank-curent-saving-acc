package com.monocept.test;

import com.monocept.model.Account;
import com.monocept.model.CurrentAccount;
import com.monocept.model.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		SavingAccount acc1 = new SavingAccount(202120034, "vandna", 5000);
		acc1.withdraw(4000);
		CurrentAccount acc2 = new CurrentAccount(202120056, "vishal", 20000);
		acc2.withdraw(40000);
		printAccountDetails(acc1);
		printAccountDetails(acc2);
		acc2.withdraw(10);
		printAccountDetails(acc2);

	}

	private static void printAccountDetails(Account obj) {
		// TODO Auto-generated method stub
		System.out.println("----------------");
		System.out.println("Account holder name is : " + obj.getName());
		System.out.println("Account number is      :" + obj.getAccountNumber());
		System.out.println("Total amount in account:" + obj.getBalance());
	}

}
