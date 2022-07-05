import java.util.Date;

public class CurrentTime {
public static void main(String[] args) {
	long timeInMillSec = System.currentTimeMillis();
	Date date = new Date(timeInMillSec);
	System.out.println(date);
}
}
