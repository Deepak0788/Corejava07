package String;

public class TestStringBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rahul");
		sb.append(" Kumar Sharma");
		System.out.println("Lentgh :"+sb);
		System.out.println("capcity:"+ sb.capacity());
		System.out.println("Char at:" + sb.charAt(1));
		System.out.println("index Of:"+ sb.indexOf("Kumar"));
		System.out.println("Replace:"+ sb.replace(0,5,"Viay"));
		System.out.println("Reverse:"+ sb.reverse());
		
		
	}

}