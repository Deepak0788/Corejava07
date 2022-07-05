package Exercise414;

public class ReverseString {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Rahul");
		sb.append("Sharma");
	System.out.println("Replace:"+ sb.replace(0,3, "mul"));
		System.out.println("Reverse:"+sb.reverse());
		System.out.println(sb.delete(0, 2));
		System.out.println(sb.codePointAt(5));
				}
	}

