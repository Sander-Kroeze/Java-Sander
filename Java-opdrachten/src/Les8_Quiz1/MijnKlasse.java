package Les8_Quiz1;

public class MijnKlasse implements MijnInterface {
//	functie die de waarde van x uit print
	public void methode() {
//		x++; 
//		geef x weer
		System.out.print(x);
	}
//	funcite die z weer geeft
	public void methode(int i) {
//		z = i
		int z = i;
//		z = z + x
		z = z + x;
//		geef z weer
		System.out.print(z);
	}
	
	public static void main(String[] args) {
//		nieuw object roept methode aan met i = 4
		new MijnKlasse().methode(4);
	}
}
