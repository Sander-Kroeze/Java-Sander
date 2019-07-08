package Les5;

import Les5.H9_Winkelwagen;

// class
public class H9_Opdracht {
//	String met text
	String naam;
//	double is voor cijfers met getallen achter de comma
	double prijs;
//	de methode voor het invullen van de gegevens
	H9_Opdracht(String naam, double prijs){
		this.naam  = naam;
		this.prijs = prijs;
	}
	
	public static void main(String[] args) {
//		maakt een object aan
		H9_Winkelwagen obj = new H9_Winkelwagen();
//		roept de print methode aan zodat de gegevens geprint kunnen worden
		obj.print();
	}
}

