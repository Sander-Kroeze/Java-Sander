package Les6_H10;

public class H10_Quiz_05 {
//	int = cijfer
	static int x;
//	string buffer
	static StringBuffer sb = new StringBuffer();
//	funcite om mijnMethode aan te roepen
	public H10_Quiz_05() {
		mijnMethode();
	}
//	functie
	public void mijnMethode() {
//		telt 3 bij x op
		x += 3;
//		zet de waarde van x in de string sb
		sb.append(x);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object
		H10_Quiz_05 mk = new H10_Quiz_05();
		H10_Quiz_05 mk2 = new H10_Quiz_05();
		H10_Quiz_05 mk3 = new H10_Quiz_05();
//		geeft de waarde van x weer
		System.out.println(mk.sb);
	}
}
