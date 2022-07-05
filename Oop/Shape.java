package Oop;
public class Shape {

	private String color = null;
			private int borderWidth = 0;
		 static final double PI = 3.14;
		 public Shape() {
			 System.out.println("THIS IS DEFAULT CONSTRUCTOR");
			 
		}
		 public Shape (String c, int w) {
			 color = c;
			 borderWidth = w;
		 }
		 public Shape(Shape type) {
			 this.color= color;
			}
			public int getBorderWidth() {
				return borderWidth;
			}
			public void setBorderWidth(int bw) {
				borderWidth = bw;
			}
			public String getColor() {
				return color;
			}
			public void setColor(String color) {
				this.color = color;
			}
			public char[] getShpe() {
				// TODO Auto-generated method stub
				return null;
			} 
			
			public Double area() {
				System.out.println();
				return null;
			}

}
