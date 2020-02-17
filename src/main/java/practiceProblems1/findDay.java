package practiceProblems1;

import java.time.LocalDate;
import java.util.Date;

public class findDay {
	
	public static String getDay(int year, int month, int date) {
		
		Date d=new Date();
		System.out.println(d.getDay());
		return LocalDate.of(year, month, date).getDayOfWeek().name();
	}

}
