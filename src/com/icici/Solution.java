package com.icici;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Bank b=new BankImpl(10000);
		
		while(true) {
			System.out.println("1:Deposit Amount 2:Withdraw Amount 3:Get Balance 4:Exit");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			int amount=0;
			if(choice==1 || choice==2) {
				System.out.println("enter the amount: ");
				amount=sc.nextInt();
	
			}
			switch(choice) {
			case 1:
				b.deposit(amount);
				break;
			case 2:
				b.withdraw(amount);
				break;
			case 3:
				System.out.println("Balance amount: "+b.getBalance());
				break;
			case 4:
				System.out.println("Thank you,visit again");
				System.exit(0);
				default:
					try {
						throw new InvalidChoiceException("Invalid choice!");
					}
					catch(Exception e) {
						System.out.println(e.getMessage());
					}
					
			}
			System.out.println("----------------------------------");
		}
	}

}
