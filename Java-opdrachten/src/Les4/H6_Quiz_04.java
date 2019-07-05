package Les4;

public class H6_Quiz_04 {
//	int = cijfer
	int x = 2;
//	print constructor
	public void print() {
//		loopt door tot dat i kleiner of gelijk is aan 3;
		for(int i = 0; i <= 3; i++) {
//			als i kleiner is dan 2
			if(i < 2) {
//				verhoog x met 1
				x ++;
//			anders
			} else {
//				verhoog x met 2
				x += 2;
			}
		}
//		laat x zien.
		System.out.print(x);
	}
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H6_Quiz_04 mk = new H6_Quiz_04();
//		object roept print functie aan
		mk.print();
	}
}
