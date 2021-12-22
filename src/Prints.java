
public class Prints {
	
	// Variables to store day abbreviations
	static final String SUN = "Sun";
	static final String MON = "Mon";
	static final String TUE = "Tue";
	static final String WED = "Wed";
	static final String THU = "Thu";
	static final String FRI = "Fri";
	static final String SAT = "Sat";
	
	// METHOD printHeader: Prints header based on starting day of week
	public static void printHeader(int dayNumber) {
		switch (dayNumber) {
			case 0: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", SUN, MON, TUE, WED, THU, FRI, SAT);
					break;
			case 1: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", MON, TUE, WED, THU, FRI, SAT, SUN);
					break;
			case 2: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", TUE, WED, THU, FRI, SAT, SUN, MON);
					break;
			case 3: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", WED, THU, FRI, SAT, SUN, MON, TUE);
					break;
			case 4: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", THU, FRI, SAT, SUN, MON, TUE, WED);
					break;
			case 5: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", FRI, SAT, SUN, MON, TUE, WED, THU);
					break;
			case 6: System.out.printf("Header: %4s %4s %4s %4s %4s %4s %4s%n", SAT, SUN, MON, TUE, WED, THU, FRI);
					break;
		}
	}
	
	// METHOD printMonth: Prints days until ending day is reached
	public static void printMonth(int day, int maxDays, int dayNumEnd) {
		int i;
		int j;
		int k;
		
		// Prints days for 4 weeks
		for (i = 0; i < 4; i++) {
			System.out.printf("Week %d:", i + 1);
			
			for (j = 0; j < 7; j++) {
				System.out.printf("%5d", day++);
				
				if (maxDays == 31) {
					if (day > 31) {
						day -= 31;
					}
				} else if (maxDays == 30) {
					if (day > 30) {
						day -= 30;
					}
				} else if (maxDays == 29) {
					if (day > 29) {
						day -= 29;
					}
				} else if (maxDays == 28) {
					if (day > 28) {
						day -= 28;
					}
				}
			}
			
			System.out.println();
		}
		
		// Prints days for 5th week
		System.out.printf("Week %d:", i + 1);
		
		for (k = day; k <= dayNumEnd; k++) {
			System.out.printf("%5d", day++);
			
			if (maxDays == 31) {
				if (day > 31) {
					day -= 31;
				}
			} else if (maxDays == 30) {
				if (day > 30) {
					day -= 30;
				}
			} else if (maxDays == 29) {
				if (day > 29) {
					day -= 29;
				}
			} else if (maxDays == 28) {
				if (day > 28) {
					day -= 28;
				}
			}
		}
	}
	
}
