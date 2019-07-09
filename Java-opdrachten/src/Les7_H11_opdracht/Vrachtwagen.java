package Les7_H11_opdracht;

//breid de class Voertuig uit
public class Vrachtwagen extends Voertuig {
//	double = cijfers met 2 getallen achter de komma
//	protected = hier kunnen alle bestanden bij uit het zelfde package
	protected double lading;
//	functie om de variabelen waardes te geven
	public Vrachtwagen(String merk, int bouwjaar, String kleur, double lading) {
//		haalt de variabelen op van de class voertuig
		super(merk, bouwjaar, kleur);
//		geeft de lading een waarde 
		this.lading = lading;
	}
//	functie om waardes weer te geven
	public void print() {
		System.out.println("---Vrachtwagen---");
//		haalt de print functie op van de class voertuigen
		super.print();
//	   	geeft lading weer
		System.out.println("Lading:    " + lading);
	}	
}
