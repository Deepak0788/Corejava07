
public class Counter {

	
	public static int count =0;
	public static int nextNumber() {
		return ++count;
	}
	public static void main(String[] args) {
		for (int i =0; i<5; i++) {System.out.println("No#" + Counter.nextNumber());
}
}
}
