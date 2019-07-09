package Les8_Opdracht;

public class Test {
	public static void main(String[] args) {
//		maakt een nieuw object aan van werknemer met de waarde 3000.0
		Werknemer wn = new Werknemer(3000.0);
//		het object wn roept de functie loonBerekenen aan met geld = 3000.0
		wn.loonBerekenen();
//		maakt een nieuw object aan van Freelancer met de waardes, uren = 140 en uurTarief = 60.00
		Freelancer fl = new Freelancer(140, 60.00);
//		het object wn roept de functie loonBerekenen aan en voerd hem uit
		fl.loonBerekenen();
	}
}
