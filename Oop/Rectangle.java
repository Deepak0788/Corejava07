package Oop;

public class Rectangle extends Shape{
	private int length  = 0;
	private int width = 0;
	private double area;
	
	public Double area() 
	{	
		return (double)(length*width);
	}
	public double getArea() {
		return area;
		
	}
	public int length() {
			return length;
		}
	public int getLength() {
		return length;
	}
		public void setLength(int l) {
			length = l;
		}
		public int getWidth() {
			return width;
		}
			public void setWidth(int w) {
				width = w;
		}

	}


