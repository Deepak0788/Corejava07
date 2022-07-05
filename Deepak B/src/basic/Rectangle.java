package basic;

public class Rectangle {
private int length = 0;
private int width = 0;
public Double area() 
{	
	return (double)(length*width);
}
public double getArea() {
	return area();
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
