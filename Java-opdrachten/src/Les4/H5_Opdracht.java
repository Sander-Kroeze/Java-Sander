package Les4;

public class H5_Opdracht {
//	strings
	String naam;
	String land = "Nederland";
//	cijfers met getallen achter de comma
	double salaris = 2400.55;
	
//	met constructors
//	als alleen de naam wordt ingevult worden de andere waardes al ingevult
	H5_Opdracht(String naam) {
		this.naam = naam;
	}
	
//	als alle waardes worden veranderd
	H5_Opdracht(String naam, String land, double salaris) {
		this.naam = naam;
		this.land = land;
		this.salaris = salaris;
	}
	
	public static void main(String[] args) {
//		zonder constructors
//		werknemer 1
//		H5_Opdracht wn1 = new H5_Opdracht();
//		wn1.naam = "Sofia";
//		wn1.land = "Belgie";
//		wn1.salaris = 3100.45;
//		werknemer 2
//		H5_Opdracht wn2 = new H5_Opdracht();
//		wn2.naam = "Daniel";
		
//		print resultaten zonder constructors
//		System.out.print("-------------- Werknemers -------------- \n");
//		System.out.print("Naam:                    " + wn1.naam  + "\n");
//		System.out.print("Salaris:                 € " + wn1.salaris + "\n");
//		System.out.print("Land:                    " + wn1.land + "\n");
//		System.out.print("-------------- \n");
//		System.out.print("Naam:                    " + wn2.naam  + "\n");
//		System.out.print("Salaris:                 € " + wn2.salaris + "\n");
//		System.out.print("Land:                    " + wn2.land + "\n");
		
		
//		een test
//		ik wilde het eerst met een for loop doen, en dan wn1 en wn2 verplaatsen met een i
//		zodat hij dan ze alle bij pakkte en dan kortere code heb, alleen kon het niet werkende krijgen.
//		for(int i = 1; i  < 3; i++ ) {
//			if(i == 1) {
//				System.out.print("-------------- Werknemers -------------- \n");
//			} else {
//				System.out.print("-------------- \n");
//			}
//			System.out.print("Naam:                    " + wn1.naam  + "\n");
//			System.out.print("Salaris:                 1€ " + wni.salaris + "\n");
//			System.out.print("Land:                    " + wn1.land + "\n");
//			System.out.print(i);
//		}
		
		
//		met constructors
//		nieuw object met alle waardes
		H5_Opdracht wn1 = new H5_Opdracht("Sofia", "Belgie", 3100.45);
//		nieuw object met 1 nieuwe waarde en met 2 al ingevulde waardes
		H5_Opdracht wn2 = new H5_Opdracht("Daniel");
//		print resultaten met constructors
		System.out.print("-------------- Werknemers -------------- \n");
		System.out.print("Naam:                    " + wn1.naam  + "\n");
		System.out.print("Salaris:                 € " + wn1.salaris + "\n");
		System.out.print("Land:                    " + wn1.land + "\n");
		System.out.print("-------------- \n");
		System.out.print("Naam:                    " + wn2.naam  + "\n");
		System.out.print("Salaris:                 € " + wn2.salaris + "\n");
		System.out.print("Land:                    " + wn2.land + "\n");
	}
}
