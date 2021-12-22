import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Scanner Object
		
		int date;	// Stores date from user input
		int month;	// Stores month from date
		int year;	// Stores year from date
		int day;	// Stores day from date
		
		int dayNumber;	// Stores the number of the day in a week (0-6)
		int dayNumEnd;	// Stores the number to end at on the calendar
		int maxDays;	// Stores maximum days for a given month
		boolean isLeapYear;	// Stores true/false for leap year
		
		date = Inputs.getDate(scanner);
		
		// Month, year, day, and dayNumEnd calculations
		month = date / 1000000;
		year = date % 10000;
		day = (date - (month * 1000000 + (year - (year / 1000) * 1000))) / 10000;
		dayNumEnd = day;
		
		// dayNumber and isLeapYear calculations
		dayNumber = Calculations.dayNum(month, day, year);
		isLeapYear = Calculations.leapYear(year);
		
		// dayNumEnd and maxDays calculations
		dayNumEnd = Calculations.dayNumberEnd(month, day, isLeapYear);
		maxDays = Calculations.maximumDays(month, isLeapYear);
		
		Prints.printHeader(dayNumber); // Function call to print header
		Prints.printMonth(day, maxDays, dayNumEnd); // Function call to print calendar
	}

}
