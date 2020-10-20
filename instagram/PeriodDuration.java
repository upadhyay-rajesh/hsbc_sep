
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
public class PeriodDuration {
	public static void main(String args[]) {
		PeriodDuration c = new PeriodDuration();
		c.testPeriod();
		//c.testDuration();
	}
	public void testPeriod() {
		// Get the current date
		LocalDate date1 = LocalDate.now();
		//date1.getDayOfWeek();
		System.out.println("Current date: " + date1);
		// add 1 m onth to the current date
		LocalDate date2 = date1.plus(1, ChronoUnit.YEARS);
		LocalDate date3 = date1.plus(5, ChronoUnit.WEEKS);
		System.out.println("Next month: " + date2);
		Period period = Period.between(date2, date1);
	//	System.out.println(period.);
		System.out.println("Period: " + period);
		
		Period period1 = Period.between(date3, date1);
		System.out.println("Period1: " + period1);
	}
	public void testDuration() {
		LocalTime time1 = LocalTime.now();
		Duration twoHours = Duration.ofHours(2);
		LocalTime time2 = time1.plus(twoHours);
		Duration duration = Duration.between(time1, time2);
		System.out.println("Duration: " + duration);
		
	}
}
