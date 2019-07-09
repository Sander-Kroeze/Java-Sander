package Les8_Opdracht;

public class Freelancer extends Werknemer {
//	functie met 2 parrameters
	public void loonBerekenen(int uren, double uurtarief) {
//		geeft uren keer 60.0 weer
		System.out.print("Freelancer verdiend: € " + uren * 60.0);
	}
	
	public static void main(String[] args) {
//		maakt een nieuwe variable aan
		Freelancer mk = new Freelancer();
//		roept loon berekenen aan met 1 parrameter
		mk.loonBerekenen(160);
//		roept loon berekenen aan met 2 parrameters
		mk.loonBerekenen(140, 60);
	}
}
