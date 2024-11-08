package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		LocalDate currentDate = LocalDate.now();
		
		LocalDate birthDate = LocalDate.of(1997, 10, 16);
		
		Period p = Period.between(birthDate, currentDate);
		
		System.out.printf("Your age is:- %d years ,%d months ,%d days",p.getYears(),p.getMonths(),p.getDays());
		
	}

}
