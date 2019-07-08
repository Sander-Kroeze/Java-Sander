package Les6_H8_gegevens;

import Les6_H8_kalender.Datum;

public class Student {
//	String zonder text
	String naam;
//	class 
	Datum geboortedatum;
	
// 	contructor met gegevens
//	dit zorgt er voor dat als Student parameters mee krijgt dat
//	dus de eerste string die is mee gegeven de naam wordt
//	en de new datum die wordt mee gegeven naar de geboorte datum wordt weg geschreven
	Student(String naam, Datum geboortedatum) {
		this.naam = naam;
		this.geboortedatum = geboortedatum;
	}
	
	public static void main(String[] args) {
//		nieuw object
		Student st1 = new Student("Emma", new Datum(28, 8, 1998));
		
//		wat voor str1 geld geld ook voor str2
		Student st2 = new Student("David", new Datum(13, 9, 1996));
		
//		laat de waardes zien
		System.out.println("---Eerste Student---");
		System.out.println("Naam: " +st1.naam);
		System.out.print("Geboortedatum: ");
		st1.geboortedatum.datumFormaat();
		
		System.out.println("\n" + "---Tweede Student---");
		System.out.println("Naam: " +st2.naam);
		System.out.print("Geboortedatum: ");
		st2.geboortedatum.datumFormaat();
		
	}
}
