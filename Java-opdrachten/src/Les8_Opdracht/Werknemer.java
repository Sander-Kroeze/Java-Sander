package Les8_Opdracht;

public class Werknemer implements Betaling {
//	double = cijfers met getallen achter de komma
	double geld;
//	functie om de waarden aan de variabelen te geven
	public Werknemer(double geld) {
//		Geeft de waarde van het parameter geld aan de variabele geld
		this.geld = geld;
	}
	
//	functie om te bepalen hoeveel de werkenmer krijgt na de belasting
	public void loonBerekenen() {
//		haalt 30% van je geld af
		double z = geld * 0.70;
//		geeft geld weer
		System.out.println("Werknemer salaris: € " + z);
	}
}
