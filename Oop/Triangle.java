package Oop;

	public class Triangle extends Shape {
		
		private int base;
		private int hight;
		public Triangle(int b, int h) {
			this.base=b;
			this.hight=h;
			// TODO Auto-generated constructor stub
		}
		
		private void Triangle(int b,int h) {
			
		}
		public Double area() {
			return (double) ((base*hight)/2);
		}

		public int getBase() {
			return base;
		}

		public void setBase(int base) {
			this.base = base;
		}

		public int getHight() {
			return hight;
		}

		public void setHight(int hight) {
			this.hight = hight;
		}

	}