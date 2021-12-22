
public class Calculations {
	
	// METHOD dayNum: Calculates number of the day in the week from 0-6
	public static int dayNum(int month, int day, int year) {
		int dayNumber;
		
		dayNumber = day += month < 3 ? year-- : year - 2;
		dayNumber = (23 * month / 9 + day + 4 + year / 4 - year / 100 + year / 400) % 7;
		
		return (dayNumber);
	}

	// METHOD leapYear: Calculates if year is a leap year (true/false)
	public static boolean leapYear(int year) {
		boolean isLeapYear;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					isLeapYear = true;
				} else {
					isLeapYear = false;
				}
			} else {
				isLeapYear = true;
			}
		} else {
			isLeapYear = false;
		}
		
		return (isLeapYear);
	}
	
	// METHOD maximumDays: Calculates number of days in a given month
	public static int maximumDays(int month, boolean isLeapYear) {
		int maxDays = 30;
		
		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: maxDays = 31;
					 break;
			case 4:
			case 6:
			case 9:
			case 11: maxDays = 30;
					 break;
			case 2:
				if (isLeapYear == true) {
					maxDays = 29;
				} else {
					maxDays = 28;
				}
				break;
		}
		
		return (maxDays);
	}
	
	// METHOD dayNumberEnd: Calculates ending day based on date
	public static int dayNumberEnd(int month, int day, boolean isLeapYear) {
		int dayNumEnd = 0;
		
		switch (month) {
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
				dayNumEnd = day;
				
				if (day == 31) {
					dayNumEnd = 30;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dayNumEnd = day;
				break;
			case 12:
				dayNumEnd = day;
				break;
			case 2:
				dayNumEnd = day;
				
				if (isLeapYear == true) {
					if (day == 1) {
						dayNumEnd = day;
					}
				} else if (isLeapYear == false) {
					if (day == 1) {
						dayNumEnd = day;
					}
				}
				break;
			case 1:
				dayNumEnd = day;
				
				if (isLeapYear == true) {
					if (day == 31) {
						dayNumEnd = 29;
					}
				} else if (isLeapYear == false) {
					if (day == 31) {
						dayNumEnd = 28;
					}
				}
				break;
		}
		
		return (dayNumEnd);
	}
	
}
