import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Scanner Object
		
		int date;	// Stores date from user input
		int month;	// Stores month from date
		int year;	// Stores year from date
		int day;	// Stores date from date
		
		int dayNumber;		
		int dayNumEnd;
		int maxDays;
		boolean isLeapYear;
		
		date = Inputs.getDate(scanner);
		
		month = date / 1000000;
		year = date % 1000;
		day = (date - (month * 1000000 + (year - (year / 1000) * 1000))) / 10000;
		dayNumEnd = day;
		
		dayNumber = Calculations.dayNum(month, day, year);
		isLeapYear = Calculations.leapYear(year);
		
		dayNumEnd = Calculations.dayNumberEnd(month, day, isLeapYear);
		maxDays = Calculations.maximumDays(month, isLeapYear);
		
		Prints.printHeader(dayNumber);
		
		Prints.printMonth(day, maxDays, dayNumEnd);
	}

}
