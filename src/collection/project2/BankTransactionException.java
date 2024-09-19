package day.six.collection.task;

public class BankTransactionException extends Exception{

	private String message;
	
	public BankTransactionException(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "BankTransactionException =[" + message + "]";
	}

	
}
