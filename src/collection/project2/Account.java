package day.six.collection.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Account {
	private static final String DEPOSIT = "deposit";
	private static final String WITHDRAW = "withdraw";

	private static int accountCounter = 0;
	
	private long accountNumber;
	private double balance;
	private Date dateOpened;
	private List<Transaction> transactionsList;

	public Account(double balance) {
		this.accountNumber = ++accountCounter;
		this.dateOpened = new Date();
		this.transactionsList = new ArrayList<Transaction>();
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public Date getDateOpened() {
		return dateOpened;
	}

	public void makeDeposit(double amount) {
		if (amount > 0) {
			this.balance = this.balance + amount;
			transactionsList.add(new Transaction(DEPOSIT, amount));
		}
	}

	public double makeWithdrawl(double amount) {

		if (amount < 0 || amount > this.balance) {
			amount = 0;
		} else {
			this.balance = this.balance - amount;
			transactionsList.add( new Transaction(WITHDRAW, amount));
		}
		return amount;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", balance=" + balance + ", dateOpened=" + dateOpened
				+ ", transactionsList=" + transactionsList + "]";
	}

	

}
