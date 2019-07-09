package Les7_H11_opdracht;


public class Voertuig {
//	int = cijfer
//	String = text
//	protected = hier kunnen alle bestanden bij uit het zelfde package
	protected String merk;
	protected int bouwjaar;
	protected String kleur;
	
//	functie om alle merken, bouwjaren en kleuren waardes toe te kennen
	public Voertuig(String merk, int bouwjaar, String kleur)
	  {
//		geeft de variabelen waardes
	    this.merk = merk;
	    this.bouwjaar = bouwjaar;
	    this.kleur = kleur;
	  }
	
//	functie om alle merken, bouwjaren en kleuren weer te geven
	public void print()
	  {
//		geeft de variabelen weer
	    System.out.println("Merk:     " + merk);
	    System.out.println("Bouwjaar: " + bouwjaar);
	    System.out.println("Kleur:    " + kleur);
	  }
	
//	het verschil is dat alles zat bij mij in functie, in die functie werden de waarden toegekend en werden deze ook weer gegeven
//	bij u is dit verdeeld over 2 functies en de variabelen worden op andere plekken gemaakt, bij u worden de globale variabelen in voertuig gemaakt,
//	en bij mij was dit in auto en in vrachtwagen, dus had ik eigenlijk dubbele variabelen.
}
