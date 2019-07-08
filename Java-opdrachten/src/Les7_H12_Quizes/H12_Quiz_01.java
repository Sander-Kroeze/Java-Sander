package Les7_H12_Quizes;

public class H12_Quiz_01 {
//	int = cijfer
//	final = dat het cijfer niet overschreven mag worden
	final int x = 3;
//	functie met 2 parameters
	int bereken(int y, int z) {
//		als y groter of gelijk is aan z
		if(y >= z) {
//			geef y + x terug
			return y + x;
//		anders	
		} else {
//			y = 5;
//			z += 3;
//			z = x / 2;
//			int x = 6;
//			x ++;
//			geef z + x terug
			return z + x;
		}
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H12_Quiz_01 mk = new H12_Quiz_01();
//		object roept de functie aan: y = 4 en z = 6
		System.out.println(mk.bereken(4, 6));
	}
}
