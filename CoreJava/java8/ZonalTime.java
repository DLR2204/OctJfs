package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTime {

	public static void main(String[] args) {
		
		
//		Set set = ZoneId.getAvailableZoneIds();
//		
//		for(Object zones:set) {
//			System.out.println(zones);
//		}
			
		ZoneId zone = ZoneId.of("US/Central");
		
		ZonedDateTime time = ZonedDateTime.now(zone);
		
		System.out.println(time);
	}
}
