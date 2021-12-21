
public class Calculations {
	
	public static int dayNum(int month, int day, int year) {
		int dayNumber;
		
		dayNumber = day += month < 3 ? year-- : year - 2;
		dayNumber = (23 * month / 9 + day + 4 + year / 4 - year / 100 + year / 400) % 7;
		return (dayNumber);
	}

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
	
}
