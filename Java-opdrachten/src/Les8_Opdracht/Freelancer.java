package Les8_Opdracht;

public class Freelancer implements Betaling {
//	double = cijfers met getallen achter de komma
	double uren;
	double uurTarief;
//	functie om de waarden aan de variabelen te geven
	public Freelancer(double uren, double uurTarief) {
//		Geeft de waarde van het parameter uren aan de variabele uren
		this.uren = uren;
//		Geeft de waarde van het parameter uurTarief aan de variabele uurTarief
		this.uurTarief = uurTarief;
	}
	
//	functie om het loon weer te geven
	public void loonBerekenen() {
//		geeft uren keer 60.0 weer
		System.out.print("Freelancer verdiend: € " + uurTarief * uren);
	}
}
