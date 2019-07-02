package les3;

public class H4_Quiz_04 {
	public static void main(String[] args) {
//		int = cijfer
		int i = 1;
//		Hier doet hij iets
		do {
//			verhoogt i met 3
			i += 3;
//			als i niet gelijk is aan 4, dit is niet waar want i = wel vier in de eerste ronde
			if(i != 4 ) {
				System.out.print('x');
			} else {
				System.out.print('y');
			}
		}
//		doe dit tot dat i niet gelijk is aan 10
		while(i != 10);
	}
}
