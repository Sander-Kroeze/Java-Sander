package les3;

public class H3_Quiz_07 {
	public static void main(String[] args) {
//		int = cijfers
		int i = 2;
		int i2 = 5;
		int i3 = 9;
		int x = 3;
//		boolean = waar of niet waar
		boolean isLangzaam = true;
//		als isLangzaam waar is
		if(isLangzaam) {
//			verhoog de veriabele x met 1
			x++;
//			als i gelijk of groter als 2 is en als i2 groter is dan 7 
			if(i >= 2 && i2 > 7) {
//				verhoog x met 4;
				x += 4;
//				geef x weer met text
				System.out.print("x" + x + ", ");
//				als i3 gelijk is aan 9;				
				if(i3 == 9) {
//					verhoog x met 5
					x += 5;
//					geef x weer met text
					System.out.print("X" + x + ", ");
				}
//			anders
			} else {
//				verhoog x met 6
				x += 6;
//				geeft x met text weer
				System.out.print("X" + x + ", ");
//				als i3 gelijk of hoger is dan 3
				if(i3 >= 3) {
//					verhoog x met 7
					x += 7;
				}
//				geef x met text weer
				System.out.print("X" + x + ", ");
			}
//			verhoog x met 3
			x += 3;
		}
//		geef x met text weer
		System.out.print("X" + x);
	}
}
