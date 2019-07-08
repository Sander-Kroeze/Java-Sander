package Les7_H12_Quizes;

// breid class Superklase uit
public class H12_Quiz4_MijnKlasse extends H12_Quiz4_Superklasse {
//	functie met 2 parrameters
	void methodeA(int x, int y) {
//		z = y min y
		int z = x - y;
//		geeft z weer
		System.out.print(z);
	}
	
	public static void main(String[] args) {
//		maakt een object aan
		H12_Quiz4_MijnKlasse mk = new H12_Quiz4_MijnKlasse();
//		roept methodeA aan, in dit geval zit er een double in dus pakken we de methodeA van de class Superklasse
//		en de som wordt dan: 5 * 3.0;
		mk.methodeA(5, 3.0);
	}
}
