// name space
package les3;

// class type
public class H3_Quiz_02 {
//	collection of strings
	public static void main(String[] args) {
//		int = cijfers
		int a = 3;
		int b = 1;
		int x = 0;
		
//		als a hoger is als b
		if(a > b) {
//			verhoog x met 1
			x ++;
//			als a hoger is dan x
			if(a > x) {
//				tel 5 bij x op
				x += 5;
			}
//			doe 4 bij x af
			x -= 4;
		}
//		als b gelijk is aan a
		if(b == a) {
//			tel 2 bij x op
			x += 2;
//			als x kleiner is dan b
			if(x < b) {
//				tel 3 bij x op
				x += 3;
			}
		}
//		geef x weer
		System.out.print(x);
//		als a gelijk is aan 4 of a gelijk of kleiner is dan 4
		if(a == 4 || a <= 4) {
//			geeft G weer
			System.out.print("G");
		}
	}
}
