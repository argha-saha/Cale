
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
	
}
