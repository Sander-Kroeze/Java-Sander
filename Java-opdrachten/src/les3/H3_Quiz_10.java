package les3;

public class H3_Quiz_10 {
	public static void main(String[] args) {
//		char is variable met string
		char resultaat = 'C';
//		test resultaat
		switch(resultaat) {
		case 'A':
//			print text
			System.out.print("Uitstekend! ");
//			stop
			break;
		case 'B':
//			print text
			System.out.print("Zeer goed ");
//			stop
			break;
		case 'C':
		case 'D':
//			print text
			System.out.print("Goed ");
		case 'E':
//			print text
			System.out.print("Probeer het opnieuw ");
//			stop
			break;
		default:
			System.out.print("Ongeldig ");
		}
	}
}
