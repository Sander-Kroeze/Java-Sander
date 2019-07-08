package Les7_Quizes;

// breid file1 uit
public class H11_Quiz6_file2 extends H11_Quiz6_file1 {
	void mijnMethode() {
//		telt 1 bij x op
		x ++;
//		geeft e weer
		System.out.print(e);
//		super roept mijnMethode aan van file1
		super.mijnMethode();
//		telt 2 bij x op
		x += 2;
//		geeft x weer
		System.out.print(x);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H11_Quiz6_file2 sk = new H11_Quiz6_file2();
//		roept mijnMethode aan van deze klasse
		sk.mijnMethode();
	}
}	
