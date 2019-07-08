package Les5;

public class H7_Quiz_03 {
//	string met text
	String strQuote = "We kunnen een probleem niet oplossen met" +
		 " de denkwijze die het heeft veroorzaakt. Albert Einstein";
//	methode
	public void mijnMethode() {
//		geeft een substring terug met de index van 23 tot 27 uit de string: strQuote
		System.out.println(strQuote.substring(23, 27));
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H7_Quiz_03 mk = new H7_Quiz_03();
//		object roept de methode aan
		mk.mijnMethode();
	}
}
