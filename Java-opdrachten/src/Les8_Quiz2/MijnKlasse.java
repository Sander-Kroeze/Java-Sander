package Les8_Quiz2;

public class MijnKlasse implements InterfaceA, InterfaceB {
//	int MAX_TOEGESTAAN;
//	int = cijfers
	int z = 2;
//	functie die h weer geeft
	public void mijnMethode() {
//		telt 4 bij max_toegestaan op en stop het in de variabele z
		z = MAX_TOEGESTAAN + 4;
//		geeft h weer
		System.out.print("H");
	}
//	functie die j en z weer geven
	public void lmijnMethode(char j) {
//		MAX_TOEGESTAAN += 3;
//		roept mijn methode aan
		mijnMethode();
//		geeft variabele j weer
		System.out.print(j);
//		geeft variabele z weer
		System.out.print(z);
	}
	
	public int som() {
//		voegt z bij max_toegestaan 
		return MAX_TOEGESTAAN + z;
	}
	
	public static void main(String[] args) {
//		maakt een nieuw argument aan
		MijnKlasse mk = new MijnKlasse();
//		mk roebt mijnMethode aan met k
		mk.lmijnMethode('k');
	}
}
