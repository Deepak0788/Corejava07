import java.text.SimpleDateFormat;
import java.util.Date;

public class Date3 {
	public static void main(String[] args) {
		Date today = new Date();
		SimpleDateFormat format1 = new SimpleDateFormat("MM dd,YYYY h:mm a");
		String stDate = format1.format(today);
		System.out.println("Format#2"+ stDate);
		System.out.println();
	}
}
