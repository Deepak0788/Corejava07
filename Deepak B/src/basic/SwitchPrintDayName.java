package basic;

public class SwitchPrintDayName {
public static void main(String[] args) {
	int day = 0;
	String dayString = null;
	switch (day) {
	case 0:
		dayString = "Sunday";
		break;
	case 1:
		dayString = "Monday";
		break;
	}
	System.out.println(dayString);
}
}
