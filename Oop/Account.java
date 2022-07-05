package Oop;

public class Account {
	private String number = null;
	private String accountType = null;
	private double balance = 0;
public Account() {
	// TODO Auto-generated constructor stub
}
public Account(String no,String Aty) {
	this.number=no;
	this.accountType=Aty;
}
public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String account) {
		this.accountType = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(int amt) {
		double bal = getBalance();
		double newbal = bal+amt;
		setBalance(newbal);
	}
	public void withdrawal(int amt) {
		
		setBalance(getBalance()-amt);
	}
	public void getBalance(double balance) {
		return;
	}
	
}