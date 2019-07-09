package Les8_Quiz3;

public class MijnKlasse extends Superklasse {
//	int = cijfer
	int x = 6;
	
	public void mijnMethode(String s) {
//		roept mijnMethode aan zonder parrameter
		mijnMethode();
//		geeft q, s en x weer
		System.out.print("q" + s + x);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		MijnKlasse mk = new MijnKlasse();
//		mk roept mijnMethode aan met w
		mk.mijnMethode("w");
	}
}
