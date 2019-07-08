package Les6_H10;

public class H10_Opdracht {
//	int = cijfers
	static int aantalTalen;
//	strings zonder inhoud
	static String taal = "";
	static String talen = "";
	
//	functie om aantalTalen bij te houden
//	en om de talen naar test te schrijven
	H10_Opdracht(String taal) {
		this.taal = taal;
//		telt 1 bij aantalTalen op
		aantalTalen++;
//		als aantalTalen gelijk is aan 5
		if(aantalTalen == 5) {
//			voeg taal bij talen op
			talen += taal;
//		anders
		} else {
//			voeg taal + ", " bij talen op
			talen += taal + ", ";
		}
	}
	
	public static void main(String[] args) {
//		maakt objecten aan
		H10_Opdracht t1 = new H10_Opdracht("Java");
		H10_Opdracht t2 = new H10_Opdracht("C++");
		H10_Opdracht t3 = new H10_Opdracht("Python");
		H10_Opdracht t4 = new H10_Opdracht("PHP");
		H10_Opdracht t5 = new H10_Opdracht("Ruby");
//		geeft het aantal programmeer talen weer en de talen
		System.out.print("Aantal programmeer talen: "+ aantalTalen + "\n" + talen);
		
	}
}
