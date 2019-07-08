package Les6_H10;

public class H10_Quiz_02 {
//	int = cijfer
	static int x = 3;
	
//	houd het aantal gemaakte objecten bij
	public H10_Quiz_02() {
		x++;
	}
	
//	functie om i - i2 bij x op te tellen
	public static int mijnMethode(int i, int i2) {
//		telt i - i2 bij x op
		x+= (i - i2);
//		geeft x terug
		return x;
	}
	
	public static void main(String[] args) {
//		maakt objecten aan
		H10_Quiz_02 mk1 = new H10_Quiz_02();
		H10_Quiz_02 mk2 = new H10_Quiz_02();
//		geeft de waarde van x weer op dit moment
		System.out.print(H10_Quiz_02.x + ", ");
//		maakt een nieuw object aan
		H10_Quiz_02 mk3 = new H10_Quiz_02();
//		roept de funcite mijnMethode aan met i = 8 en i2 = 3
		H10_Quiz_02.mijnMethode(8, 3);
//		geeft x weer
		System.out.print(H10_Quiz_02.x);
	}
}
