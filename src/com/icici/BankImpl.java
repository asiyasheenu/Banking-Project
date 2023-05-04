package com.icici;

public class BankImpl  implements Bank{
	int balance;
	
	BankImpl(int balance){
		this.balance=balance;
	}
	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs. "+amount);
		balance+=amount;
		System.out.println("Amount deposited succcessfully");
		
	}
	@Override
	public void withdraw(int amount) {
		if(amount<=balance) {
			System.out.println("Withdrawing Rs: "+amount);
			balance-=amount;
			System.out.println("Amount withdrawn succcessfully");
		}
		else {
			try {
				throw new InsufficientBalanceException("Insufficient balance!");
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	@Override
	public int getBalance() {
		return balance;
	}
	

}
