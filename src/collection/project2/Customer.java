package day.six.collection.task;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private static int customerCounter = 0;
	private String name;
	private long customerID;
	private String address;
	private List<Account> accountsList;

	public Customer(String name) {
		this.customerID = ++customerCounter;
		this.name = name;
		this.accountsList = new ArrayList<Account>();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public long getCustomerID() {
		return customerID;
	}

	public List<Account> getAccountsList() {
		return accountsList;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", customerID=" + customerID + ", address=" + address + ", accountsList="
				+ accountsList + "]";
	}

}
