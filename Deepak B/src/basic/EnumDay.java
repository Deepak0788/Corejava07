package basic;

public class EnumDay {
public int getWeekDay() {
	switch (this) {
	case SUNDAY:
		return 0;
	case MONDAY:
		return 1;
		
	case SATURDAY:
		return 6;
		
	}
}
}
