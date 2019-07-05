package Les4;

public class H6_Quiz_06 {
//	constructor met 2 parameters
	public void mijMethode(int x, int y) {
//		int = cijfers
		int z = 4;
		int i = 3;
//		verhoog de waarde van i met 1
		i++;
//		als x kleiner is dan y
		if(x < y) {
//			verhoog z met 4
			z += 4;
		}
//		als x keer x groter is dan y
		if(x * x > y) {
//			verhoog z met 2
			z += 2;
//		anders
		} else {
//			verhoog de waarde van z met 6
			z += 6;
		}
//		verhoog x met 1
		z++;
//		laat de waarde van z zien
		System.out.print(z);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H6_Quiz_06 mk = new H6_Quiz_06();
//		object roept de constructor aan met 3 = x en y = 9
		mk.mijMethode(3, 9);
	}
}
