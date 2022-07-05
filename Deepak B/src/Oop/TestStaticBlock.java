package Oop;

public class TestStaticBlock {
static {System.out.println("I will call first");
}

public static void main(String[] args) {
	System.out.println("I will call second");
}
}