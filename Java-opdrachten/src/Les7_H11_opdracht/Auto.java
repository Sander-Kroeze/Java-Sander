package Les7_H11_opdracht;

// breid de class Voertuig uit
public class Auto extends Voertuig {
//	double = cijfers met 2 getallen achter de komma
//	protected = hier kunnen alle bestanden bij uit het zelfde package
	protected int passagiers;

//	functie om de variabelen waardes te geven
	public Auto(String merk, int bouwjaar, String kleur, int passagiers) {
//		haalt de variabelen op van de class voertuig
		super(merk, bouwjaar, kleur);
//		geeft passagiers een waarde 
		this.passagiers = passagiers;
	}
//	functie om waardes weer te geven
	public void print() {
		System.out.println("---Auto---");
//		haalt de print functie op van de class voertuigen
		super.print();
//		geeft lading weer
	    System.out.println("passagiers: " + passagiers);
	}
	
}
