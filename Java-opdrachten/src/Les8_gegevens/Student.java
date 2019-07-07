package Les8_gegevens;
// haalt de class Datum op uit het pakket kalender
import Les8_kalender.Datum;

public class Student {
//	String zonder text
	String naam;
//	class 
	Datum geboortedatum;
//	contructor zonder gegevens
	Student() {
		
	}
// 	contructor met gegevens
	Student(String naam, Datum geboortedatum) {
		this.naam = naam;
		this.geboortedatum = geboortedatum;
	}
	
	public static void main(String[] args) {
//		nieuw object
		Student st1 = new Student();
//		object.naam krijgt text
		st1.naam = "Emma";
//		object.geboortedatum krijgt de waarden van de class die ge import is
		st1.geboortedatum = new Datum(28, 8, 1998);
		
//		wat voor str1 geld geld ook voor str2
		Student st2 = new Student();
		st2.naam = "David";
		st2.geboortedatum = new Datum(13, 9, 1996);
		
//		laat de waardes zien
		System.out.println("---Eerste Student---");
		System.out.println("Naam: " +st1.naam);
		System.out.print("Geboortedatum: ");
		st1.geboortedatum.myMethod();
		
		System.out.println("\n" + "---Tweede Student---");
		System.out.println("Naam: " +st2.naam);
		System.out.print("Geboortedatum: ");
		st2.geboortedatum.myMethod();
		
	}
}
