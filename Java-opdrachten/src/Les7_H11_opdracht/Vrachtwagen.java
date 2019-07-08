package Les7_H11_opdracht;

//breid de class Voertuig uit
public class Vrachtwagen extends Voertuig {
//	String = text
//	int = cijfer
//	double = cijfers met getallen achter de komma
	protected String merk;
	protected int bouwjaar;
	protected String kleur;
	protected double lading;
//	maakt een functie met 4 parrameters
	Vrachtwagen(String merk, int bouwjaar, String kleur, double lading) {
//		geeft de waarde aan de variabelen
		this.merk = merk;
		this.bouwjaar = bouwjaar;
		this.kleur = kleur;
		this.lading = lading;
//		geeft de variabelen weer
		System.out.println("---Vrachtwagen---");
		System.out.println("Merk: " + this.merk);
		System.out.println("Bouwjaar: " + this.bouwjaar);
		System.out.println("Kleur: " + this.kleur);
		System.out.println("Lading: " + this.lading);
	}
}
