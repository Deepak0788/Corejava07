package basic;
public class SystemsecurityManager {
public static void main(String[] args) {
	SecurityManager secManager = System.getSecurityManager();
	if(secManager == null) {
		System.out.println("SecurityManager is not configured");
	}
	secManager = new SecurityManager();
	System.setSecurityManager(secManager);
	
	secManager = System.getSecurityManager();
	if (secManager!= null) {
		System.out.println("SecurityManager is configured");
	}
}
}
