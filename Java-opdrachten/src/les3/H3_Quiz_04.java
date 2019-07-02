package les3;

public class H3_Quiz_04 {
	public static void main(String[] args) {
//		int = cijfers
		int a = 2;
		int b = 2;
		int x = 5;
//		als a gelijk is aan bij
		if(a == b) {
//			verhoog de waarde met 1
			x++;
		}
//		als b gelijk is aan 2
		else if(b == 2) {
//			verhoog de waarde met 2
			x += 2;
//			anders
		} else {
//			verhoog de waarde met 3
			x += 3;
		}
//		geeft varibale x weer
		System.out.print(x);
	}
}
