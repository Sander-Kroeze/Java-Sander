package Les8_Opdracht;

public abstract class Werknemer implements Betaling {
	public void loonBerekenen(int uren) {
		System.out.print(uren * 18.75);
	}
}
