import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Scanner Object
		
		int date;	// Stores date from user input
		int month;	// Stores month from date
		int year;	// Stores year from date
		int day;	// Stores date from date
		
		int curMonth;
		int dayNumber;
		
		int dayNumEnd;
		int maxDays;
		boolean isLeapYear;
		
		date = Inputs.getDate(scanner);
		
		month = date / 10000;
		year = 2000 + (date % 100);
		day = (date - (month * 10000 + (year - 2000))) / 100;
		dayNumEnd = day;
		
		dayNumber = Calculations.dayNum(month, day, year);
		isLeapYear = Calculations.leapYear(year);
		
		Prints.printHeader(dayNumber);
	}

}
