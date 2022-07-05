package Oop;

public class TestAccount {
	public static void main(String[] args) {
		
	
	Account a  = new Account("kl12356","saving"); 
	System.out.println(a.getNumber()+"  "+a.getAccountType());
	a.deposit(5000);
	System.out.println(a.getBalance());
a.withdrawal(3000);
System.out.println(a.getBalance());
}
}
