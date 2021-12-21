
public class Prints {
	
	public static void printHeader(int dayNumber) {
		switch (dayNumber) {
			case 0: System.out.println("Header: Sun Mon Tue Wed Thu Fri Sat");
					break;
			case 1: System.out.println("Header: Mon Tue Wed Thu Fri Sat Sun");
					break;
			case 2: System.out.println("Header: Tue Wed Thu Fri Sat Sun Mon");
					break;
			case 3: System.out.println("Header: Wed Thu Fri Sat Sun Mon Tue");
					break;
			case 4: System.out.println("Header: Thu Fri Sat Sun Mon Tue Wed");
					break;
			case 5: System.out.println("Header: Fri Sat Sun Mon Tue Wed Thu");
					break;
			case 6: System.out.println("Header: Sat Sun Mon Tue Wed Thu Fri");
					break;
		}
	}
	
	public static void printMonth(int day, int maxDays, int dayNumEnd) {
		int i;
		int j;
		int k;
		
		for (i = 0; i < 4; i++) {
			System.out.print("Week " + (i + 1) + ": ");
			
			for (j = 0; j < 7; j++) {
				System.out.print(day++ + " ");
				
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
		
		System.out.print("Week " + (i + 1) + ": ");
		
		for (k = day; k <= dayNumEnd; k++) {
			System.out.print(day++ + " ");
			
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
