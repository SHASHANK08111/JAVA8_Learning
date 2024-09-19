package day.six.collection.task;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private List<Customer> customersList = new ArrayList<Customer>();

	public List<Customer> getCustomersList() {
		return customersList;
	}

	public PersonalCustomer createPersonalCustomer(String name, String homePhone, String workPhone, String address) {
		PersonalCustomer pc = new PersonalCustomer(name);
		pc.setAddress(address);
		pc.setHomePhone(homePhone);
		pc.setWorkPhone(workPhone);
		customersList.add(pc);
		return pc;
	}

	public CommercialCustomer createCommercialCustomer(String name, String contactPerson, String contactPersonPhone,
			String address) {
		CommercialCustomer cc = new CommercialCustomer(name);
		cc.setAddress(address);
		cc.setContactPerson(contactPerson);
		cc.setContactPersonPhone(contactPersonPhone);
		customersList.add(cc);
		return cc;
	}

	public long openAccount(long customerID) {
		long newAccountNumber = 0;
		for (Customer customer : customersList) {
			if (customer.getCustomerID() == customerID) {
				List<Account> accountsList = customer.getAccountsList();
				Account account = new Account(0.0);
				accountsList.add(account);
				newAccountNumber = account.getAccountNumber();
			}
		}

		return newAccountNumber;
	}

}
