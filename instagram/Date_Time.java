

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date_Time {

	public static void main(String[] args) {
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		System.out.println(localDateTime.atZone(ZoneId.of("America/New_York")));
		// prints 2014-09-28T13:07:31.207-04:00[America/New_York]
		System.out.println(DayOfWeek.from(localDateTime));
		// prints SUNDAY.
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		
		System.out.println(zonedDateTime.format(DateTimeFormatter.ofPattern("'The' dd 'day of' MMM 'in year' YYYY 'and zone is' z")));
		
		System.out.println(zonedDateTime);
		System.out.println(zonedDateTime.toInstant());
		System.out.println(zonedDateTime.withZoneSameInstant(ZoneId.of("America/Chicago")));
		System.out.println(zonedDateTime.withZoneSameLocal(ZoneId.of("America/Chicago")));

	}

}
