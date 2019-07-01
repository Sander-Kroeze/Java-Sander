package les3;

public class H3_Quiz_05 {
	public static void main(String[] args) {
//		int = cijfers
		int i = 1;
		int i2 = 4;
		int x = 2;
//		als i geijk is aan i2 - 3 en als i2 groter is dan 5
		if(i == (i2 - 3) && i2 > 5) {
//			verhoog x met 1
			x++;
		}
//		als i2 gelijk is aan 4
		else if(i2 == 4) {
//			verhoog x met 2;
			x += 2;
		}
//		als i2 groter is dan 3
		else if(i2 > 3) {
//			verhoog x met 3
			x += 3;
//			anders
		} else {
//			verhoog x met 4;
			x += 4;
		}
//		geef variabele x weer
		System.out.print(x);
	}
}

