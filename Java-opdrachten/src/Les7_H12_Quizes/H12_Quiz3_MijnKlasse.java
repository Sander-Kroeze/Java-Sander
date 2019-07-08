package Les7_H12_Quizes;

// Breid class Superklasse uit
public class H12_Quiz3_MijnKlasse extends H12_Quiz3_Superklasse {
//	int = cijfer
	int x = 3;
//	functie met 2 parrameters
	String methodeA(String s, int i) {
//		str = s + , + i
		String str = s + ", " + i;
//		geeft str terug
		return str;
	}
	
	public static void main(String[] args) {
//		maakt een object aan
		H12_Quiz3_MijnKlasse mk = new H12_Quiz3_MijnKlasse();
//		object roept de methodeA aan en wordt weer gegevens
//		het maakt niet uit of je 23 in de eerste of in de tweede parrameter stop,
//		in de class Superklasse  hebben we de parramers andersom staan dus het werkt bij de kanten op
//		maar het wordt wel andersom weergegeven.
		System.out.print(mk.methodeA(23, "Emma"));
	}
}
