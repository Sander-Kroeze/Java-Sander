package Les5;

public class H7_Quiz_05 {
//	string met text
	String mijnStr = " de aarde is 4.6 miljard jaar oud ";
//	methode
	public void mijnMethode() {
//		lengte van de string
		int strLength = mijnStr.length();
//		zet mijnStr in hoofdletters
		mijnStr = mijnStr.toUpperCase();
//		trim() verwijderd spaties aan de voorkant en achterkant van de string
		mijnStr = mijnStr.trim();
//		geeft variabelen weer
		System.out.println(strLength + " " + mijnStr + " " + mijnStr.length());
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H7_Quiz_05 mk = new H7_Quiz_05();
//		het object roept mijnMethode aan
		mk.mijnMethode();
	}
}
