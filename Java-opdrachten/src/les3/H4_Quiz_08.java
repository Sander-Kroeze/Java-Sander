package les3;

public class H4_Quiz_08 {
	public static void main(String[] args) {
//		int = cijfers
		int x = 17;
		int y = 3;
//		doe dit zolang i kleiner is dan 10
		for(int i = 0; i < 10; i ++) {
//			verhoog x met 2 en y met 5;
			x += 2;
			y += 5;
//			als x groter of gelijk is aan 21
			if(x >= 21) {
//				stop
				break;
			}
		}
//		geef variable y weer
		System.out.print(y);
	}
}
