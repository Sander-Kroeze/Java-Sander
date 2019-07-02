package les3;

public class H3_Quiz_06 {
	public static void main(String[] args) {
//		int = cijfer
		int i1 = 3;
		int i2 = 9;
		int i3 = 12;
		int x = 0;
//		als x groter is dan -1
		if(x > - 1) {
//			verhoog x met 1
			x++;;
//			als i3 gelijk is aan i1 + i2
			if(i3 == (i1 + i2)) {
//				verhoog x met 4
				x += 4;
//				als i1 kleiner is dan 5
				if(i1 < 5) {
//					verhoog x met 2
					x += 2;
				}
//				als i2 gelijk is aan 9
				else if(i2 == 9) {
//					verhoog x met 1
					x++;
//					anders
				} else {
//					verlaag x met 2
					x -= 2;
				}
//				verlaag x met 6
				x -= 6;
			}
//			als i3 kleiner is dan 10
			if(i3 < 10) {
//				tel 7 bij x op
				x += 7;
//				anders
			}else {
//				tel 5 bij x op
				x += 5;
			}			
		}
		System.out.print(x);
	}
}
