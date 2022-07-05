package basic;

public class ReadSystemEnviromentVariables {
public static void main(String[] args) {
	
	String path = System.getenv("PATH");
	System.out.println(path);
	
}
}
