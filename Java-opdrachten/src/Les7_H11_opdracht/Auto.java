package Les7_H11_opdracht;

// breid de class Voertuig uit
public class Auto extends Voertuig {
//	String = text
//	int = cijfer
	protected String merk;
	protected int bouwjaar;
	protected String kleur;
	protected int passagiers;
//	maakt een functie met 4 parrameters
	Auto(String merk, int bouwjaar, String kleur, int passagiers) {
//		geeft de waarde aan de variabelen
		this.merk = merk;
		this.bouwjaar = bouwjaar;
		this.kleur = kleur;
		this.passagiers = passagiers;
//		geeft de variabelen weer
		System.out.println("---Auto---");
		System.out.println("Merk: " + this.merk);
		System.out.println("Bouwjaar: " + this.bouwjaar);
		System.out.println("Kleur: " + this.kleur);
		System.out.println("Passagiers: " + this.passagiers);
	}
}
