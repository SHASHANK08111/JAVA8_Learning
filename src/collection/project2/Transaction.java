package day.six.collection.task;

import java.time.LocalDateTime;

public class Transaction {
	
	private static long transactionCounter = 0;
	private long transactionID;
	private double amount;
	private String type;
	private LocalDateTime dateTime;
	
	public Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
		this.dateTime = LocalDateTime.now();
		transactionID = ++transactionCounter;
	}

	public long getTransactionID() {
		return transactionID;
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	@Override
	public String toString() {
		return "Transaction [transactionID=" + transactionID + ", amount=" + amount + ", type=" + type + ", dateTime="
				+ dateTime + "]";
	}
	
	
	

}
