package Les5;

public class H7_Quiz_08 {
//	string object
	StringBuffer sb = new StringBuffer("Hij was haar vriend");
//	methode
	public void mijnMethode() {
//		vervangt haar naar je 
		sb.replace(8, 13, "je ");
//		geeft sb weer
		System.out.print(sb);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H7_Quiz_08 mk = new H7_Quiz_08();
//		object roept de methode aan
		mk.mijnMethode();
	}
}
