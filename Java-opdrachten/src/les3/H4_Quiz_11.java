package les3;

public class H4_Quiz_11 {
	public static void main(String[] args) {
//		outer geeft aan dat dit de buitenste loop is
//		doe dit zolang rij kleiner is dan 4
		outer:for(int rij = 1; rij < 4; rij++) {
//			dit is de binnenste loop dus hier zou je inner voor kunnen zetten
//			doe dit zolang kol kleiner is dan 5
			for(int kol = 1; kol < 5; kol++) {
//				als rij gelijk is aan 2 en kol gelijk is aan 3
				if (rij == 2 && kol == 3) {
//					stop de outer loop
					break outer;
//					dit zou ook break inner kunnen zijn
				}
//				geef de variabelen rij en kol weer
				System.out.print(rij + "," + kol + " ");
			}
		}
	}
}
