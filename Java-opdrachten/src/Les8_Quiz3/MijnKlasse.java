package Les8_Quiz3;

public class MijnKlasse extends Superklasse {
//	int x = 6;
	
	public void mijnMethode(int uren, double uurtarief) {
		System.out.print(uren * 60.0);
	}
	
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		mk.mijnMethode(160);
		mk.mijnMethode(140, 60);
	}
}
