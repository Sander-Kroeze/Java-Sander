package Les4;

public class H5_Quiz_04 {
//	string variable
	String naam = "Ron";
//	voor getallen achter de comma
	double salaris = 400.0;
//	als er alleen een naam is ingevult geeft hij de ingevulde naam terug met
//	dus het salaris van 780.0
	H5_Quiz_04(String naam) {
		this(naam, 780.0);
	}
//	als er wel een naam en salaris is ingevult
//	geeft hij dus beide terug
	H5_Quiz_04(String naam, double salaris) {
		this.naam = naam;
		this.salaris = salaris;
	}
	
	public static void main(String[] args) {
//		nieuw object aangemaakt met alleen de naam henk
		H5_Quiz_04 md = new H5_Quiz_04("Henk");
//		laat het object.naam en .salaris zien
//		omdat we alleen een naam hebben ingevult is de standaard salaris 780.0
		System.out.print(md.naam + ", " + md.salaris);
		
//		vragen
//		hier maken we een nieuw object, met een naam en salaris
		H5_Quiz_04 mwObject = new H5_Quiz_04("Femke", 2000.55);
//		laten we het nieuwe object zien van de naam en het salaris
		System.out.println("\n" + mwObject.naam + ", " + mwObject.salaris);
	}
}
