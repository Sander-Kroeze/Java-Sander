package Les8_Opdracht;

public abstract class Werknemer implements Betaling {
//	functie met 1 parrameter
	public void loonBerekenen(int uren) {
//		geeft uren keer 18.75 weer
		System.out.println("Werknemer: € " + uren * 18.75);
	}
}
