package argumentpassing;

public class HelloName {

	
	public static void main(String[] args) {
		
		
		
		if(args.length==2) {
			System.out.println("hello "+ args[0]+args);
			
		}else {
			System.out.println("name is reqired");
		}
	}
	
}
