package basic;
public class WhileWithBreak {
public static void main(String[] args) {
	int i = 0;
	boolean flag = true;
	while (flag) {
		if (i == 5) {
			break;
		}
		System.out.println(i + "Hello Java");
		i++;
	}
}
}
