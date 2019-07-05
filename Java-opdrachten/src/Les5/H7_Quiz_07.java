package Les5;

public class H7_Quiz_07 {
//	string objecten met text
	StringBuffer sb = new StringBuffer("Hij is vriend.");
//	methode
	public void mijnMethode() {
//		voegt "mijn" toe op de index 7 in de string
		sb.insert(7, "mijn " );
//		geeft sb weer
		System.out.print(sb);
	}
	
	public static void main(String[] args) {
//		maakt een object aan
		H7_Quiz_07 mk = new H7_Quiz_07(); 
//		object roept de methode aan
		mk.mijnMethode();
	}
}
