package Les4;

public class H6_Quiz_01 {
//	double voor cijfers met getallen achter de comma
	double ozGoudPrijs = 1300.0;
	double ozZilverPrijs = 20.0;
//	boolean, true or false
	boolean isGoud = true;
	
	public double berekenMetaalPrijs(boolean isGoud, int ounce) {
//		als isGoud true is dan
		if(isGoud) {
//			geef de prijs (1300.0) keer ounce weer
			return ozGoudPrijs * ounce;
//		anders	
		} else {
//			geef de prijs (20.0) keer ounce weer 
			return ozZilverPrijs * ounce;
		}
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H6_Quiz_01 em = new H6_Quiz_01();
//		laat het object zien, maar nu is isGoud false en wordt ounce 4
//		dus wordt de else in het if statement uitgevoerd dus wordt de som: 20.0 * 4
		System.out.print(em.berekenMetaalPrijs(false, 4));
		System.out.print(", ");
//		laat het object zien, maar nu is isGoud true, dus word de som: 1300.0 * 2
		System.out.print(em.berekenMetaalPrijs(true, 2));
	}
}
