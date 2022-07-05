package String;

public class TestString3 {
public static void main(String[] args) {
	String s = "Rahulsharma";
	System.out.println("7 th character is-"+s.charAt(6));
	System.out.println(s.indexOf("l"));
		System.out.println(s.lastIndexOf("m"));
		System.out.println(s.replace("s", "w"));
		System.out.println(s.replaceAll("Rahul", "Vinod"));
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.startsWith("Rahul"));
		System.out.println(s.endsWith("sharma"));
		System.out.println(s.substring(5));
		String s1 = "Mr ";
		String s2 ="Rahul Sharma";
		System.out.println(s1.concat(s2));
		

		
		
	}

}


