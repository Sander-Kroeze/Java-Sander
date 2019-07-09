package Les7_H11_opdracht;

// breid Voertuig uit
public class TestProgramma extends Voertuig {
	public static void main(String[] args) {
//		maakt auto objecten aan
		Auto aut1 = new Auto("Toyota", 2013, "Rood", 5);
		Auto aut2 = new Auto("Mazda", 2017, "Blauw", 8);
//		objecten roepen de print functie van auto aan
		aut1.print();
		aut2.print();
//		maakt Vrachtwagen objecten aan
		Vrachtwagen vrw1 = new Vrachtwagen("BMW", 2016, "Groen", 6550.0);
		Vrachtwagen vrw2 = new Vrachtwagen("Volvo", 2014, "Zwart", 4000.0);
//		objecten roepen de print funcite van Vrachtwagen aan
		vrw1.print();
		vrw2.print();
	}
}
