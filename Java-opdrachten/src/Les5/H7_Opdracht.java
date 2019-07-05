package Les5;

public class H7_Opdracht {
//	string met tekst
	String sb = "Brazilië$ is een$ groot$ lan$d in Zuid$-Amerika.";
//	methode
	public void stringDemo() {
//		text in hoofdletters
		sb = sb.toUpperCase();
		System.out.println("Hoofdletters: " + sb);
//		text in kleine letters
		sb = sb.toLowerCase();
		System.out.println("Kleine letters: " + sb);
//		aantal tekens van de tekst
		int strLength = sb.length();
		System.out.println("Aantal tekens: " + strLength);
//		verwijder dollar tekens
		System.out.println("Verwijder $: " + sb.replace("$", ""));
//		verwijder eerste 10
		StringBuffer sb2 = new StringBuffer(sb);
		sb2.replace(0, 10, "");
		System.out.println("Verwijder eerste 10: " + sb2);
//		quote uit de zin
		System.out.println("Levert groot op: " + sb.substring(18, 23));
//		index van het eerste dolar teken
		int teken1 = sb.indexOf("$");
		System.out.println("Eerste $ symbool: " + teken1);
//		index van het laatste dollar teken.
		int teken2 = sb.lastIndexOf("$");
		System.out.println("Laatste $ symbool: " + teken2);
//		vervangt brazilie door argentinie
		StringBuffer sb3 = new StringBuffer(sb);
		System.out.println(sb3.replace(0, 8, "Argentinië"));
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H7_Opdracht mk = new H7_Opdracht();
//		mk roept de methode stringDemo aan
		mk.stringDemo();
	}
}
