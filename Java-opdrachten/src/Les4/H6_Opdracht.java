package Les4;

public class H6_Opdracht {
	
//	de methode waarmee het wordt uitgevoerd
	public double getOunce(double goud) {
//		goud word hier onder dus het getal wat je aan het einde van dit programma invult
//		in dit geval is dat: 5525, dus wordt de som: 5525 / 1300.00
		return goud / 1300.00;
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H6_Opdracht mk = new H6_Opdracht();
//		geeft het resultaat weer als goud 5525 is
		System.out.print(mk.getOunce(5525));
	}
}
