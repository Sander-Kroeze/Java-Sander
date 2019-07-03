package Les4;

public class H5_Quiz_01 {
// 	instantievariabelen
//	string
	String naam = "Anna";
//	int = cijfer
	int leeftijd = 22;
	
	public static void main(String[] args) {
//		maakt nieuwe opjecten aan van de variable leeftijd en naam die buiteln de static void staan
		H5_Quiz_01 wn = new H5_Quiz_01();
		H5_Quiz_01 wn2 = new H5_Quiz_01();
		
//		maak een nieuwe wn aan van de variable naam en leeftijd
		wn.naam = "Jan";
		wn.leeftijd = 20;
//		geeft de waarde "jan terug", omdat we dit hebben gekoppelt aan wn
		System.out.print(wn.naam + " ");
//		dit geeft de leeftijd van Anna terug, omdat deze al buiten de void stond wordt deze toe gekent aan 
//		het object wat leeg was
		System.out.print(wn2.leeftijd + " ");
	}
}
