package Les5;

public class H7_Quiz_02 {
//	strings met text
	String str1 = "Noah";
	String str2 = new String("Noah");
	
	public void mijnMethode() {
//		als str1 gelijk is aan str2
//		dit wordt onwaar, omdat str1 en str2 andre objecten zijn.
		if(str1 == str2) {
//			print x
			System.out.print("X");
		}
//		als str1 gelijk is aan 2
//		dit wordt waar omdat str1 en str2 de zeldfe waarden bevatten
		if(str1.equals(str2)) {
//			print Y
			System.out.print("Y");
//		anders
		} else {
//			print z
			System.out.print("Z");
		}
	}
	
	public static void main(String[] args) {
//		maakt een object aan
		H7_Quiz_02 mk = new H7_Quiz_02();
//		object roept een methode aan
		mk.mijnMethode();
	}
}
