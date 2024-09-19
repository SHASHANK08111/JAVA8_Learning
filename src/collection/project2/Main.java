package day.six.collection.task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Bank bank = new Bank();
		do {
			long customerID = 0;
			long accountNumber = 0;
			double amount = 0;
			System.out.println("1. Create Personal Customer");
			System.out.println("2. Create Commercial Customer");
			System.out.println("3. Open New Account");
			System.out.println("4. Deposit");
			System.out.println("5. Withdraw");
			System.out.println("6. Customer Summary");
			System.out.println("7. Grand Summary");
			System.out.println("8. Exit");
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter choice");
			
			int choice = scanner .nextInt();
			
			switch (choice) {
			case 1: 
				PersonalCustomer pc = bank.createPersonalCustomer("name", "hp", "wp", "address");
				System.out.println(pc);
			break;
			case 2: 
				CommercialCustomer cc = bank.createCommercialCustomer("name", "cp", "cpp", "address");
				System.out.println(cc);
				break;
				
			case 3: 
				System.out.println("Enter customer id :");
				 customerID = scanner.nextLong();
				try {
					accountNumber = bank.openAccount(customerID);
				} catch (BankTransactionException e) {
					System.out.println(e);
				}
				if (accountNumber != 0) {
					System.out.println("Here is your account number "+accountNumber);	
				}else {
					System.out.println("Account creation failed, No customer found with given id !!");
				}
				
			break;
			
			case 4:
				System.out.println("Enter customer id :");
				 customerID = scanner.nextLong();
				 System.out.println("Enter account number:");
				 accountNumber = scanner.nextLong();
				 System.out.println("Enter amount :");
				 amount = scanner.nextDouble();
				 bank.deposit(customerID, accountNumber, amount);
				break;
			case 5:
				System.out.println("Enter customer id :");
				 customerID = scanner.nextLong();
				 System.out.println("Enter account number:");
				 accountNumber = scanner.nextLong();
				 System.out.println("Enter amount :");
				 amount = scanner.nextDouble();
				 System.out.println(bank.withdraw(customerID, accountNumber, amount));
				break;
								
			case 6:
				System.out.println("Enter customer id :");
				 customerID = scanner.nextLong();
				Customer c = bank.getCustomer(customerID);
				System.out.println(c);
				
				break;
			case 7:
				Customer[] customers = bank.getCustomers();
				int customerCount = bank.getCustomerCount();
				for (int i = 0; i < customerCount; i++) {
					System.out.println(customers[i]);
				}
				break;
			case 8:
				System.exit(0);
			}
			
		} while (true);
		
		
		
	}

}
