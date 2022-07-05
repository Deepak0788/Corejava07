package Oop;

public class TestShpae {

	public static void main(String[] args) {
	 
	Shape s  = new Shape(); 
	
	s.setColor("Red");
	s.setBorderWidth (5);
	int borderW= s.getBorderWidth();
	System.out.println(borderW);
	String color = s.getColor();
	System.out.println(color);

	}

}
