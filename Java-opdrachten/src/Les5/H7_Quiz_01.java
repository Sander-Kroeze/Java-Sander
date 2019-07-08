package Les5;

public class H7_Quiz_01 {
//	een string met text
	String strSpreekwoord = "De aanval is de beste verdediging.";
	
//	een methode
	public void mijnMethode() {
//		geef het caracter of index 5 weer
		System.out.print(strSpreekwoord.charAt(5));
//		geef de index van d weer, d is niet in een hoofdletter dus gaat ga naar de eerste kleine d toe
		System.out.print(", " + strSpreekwoord.indexOf("d"));
//		geeft de index van i weer, zelfde hier, i is niet in een hoofdletter geschreven en vind dus de eerste kleine i in de string
		System.out.print(", " + strSpreekwoord.indexOf("i"));
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H7_Quiz_01 ut = new H7_Quiz_01();
//		object roept de methode aan
		ut.mijnMethode();
	}
}
