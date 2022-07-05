public class TestStringBuffer {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Rahul");
sb.append("Sharma");
System.out.println("Length:"+sb);
System.out.println("capacity:"+ sb.capacity());
System.out.println("Char at:"+ sb.charAt(2));
System.out.println("index of:"+ sb.indexOf("a"));
System.out.println("Replace:"+ sb.replace(0,3, "mul"));
System.out.println("Reverse:"+sb.reverse());
		}
}
