package basic;
public class TestPerson {
public static void main(String[] args) {
	Person p = null;
	p = new Person();
	p.setName("Arjun");
	p.setAddress("MGRoad");
	System.out.println("Name:"+ p.getName());
	System.out.println("Address:"+ p.getAddress());
}
}
