package Oop;

public class StringS1 {

	public static void main(String[] args) {
		
		String n = "Vijay Aloknath Chouhan";
		System.out.println("String length:" +n.length());
		System.out.println("7th Character:"+n.charAt(6));
		System.out.println("Index of Alok:"+n.indexOf("Alok"));
		System.out.println("1# pos of i:" +n.indexOf("i"));
		System.out.println("a is replace by b:"+n.replace("a", "b"));
		System.out.println("Lower Name:"+ n.toLowerCase());
		System.out.println("Upper Name:"+ n.toUpperCase());
		System.out.println("Dad's name:"+ n.substring(6));
	
	}
}
