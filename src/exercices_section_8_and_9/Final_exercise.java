package exercices_section_8_and_9;

import java.util.Locale;
import java.util.Scanner;
import entities.BankAccount;

public class Final_exercise {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char initialDeposit = sc.next().charAt(0);
		
		BankAccount acc;
		
		if(initialDeposit == 'y' || initialDeposit == 'Y') {			
			System.out.print("Enter initial deposit value: ");
			double initialDepositValue = sc.nextDouble();
			acc = new BankAccount(accountNumber, accountHolder,initialDepositValue);
		} else {
			acc = new BankAccount(accountNumber, accountHolder);
		}
		
		System.out.println(acc.getDataAccount());
		
		// Deposit
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		acc.deposit(depositValue);
		
		System.out.println("Updated data account:");
		System.out.println(acc.getDataAccount());
		
		
		// Withdraw
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		acc.withdraw(withdrawValue);
		
		System.out.println("Updated data account:");
		System.out.println(acc.getDataAccount());
		
		sc.close();
	}

}
