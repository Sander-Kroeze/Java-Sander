package Les7_Quizes;

// breid file1 uit
public class H11_Quiz1_file2 extends H11_Quiz1_file1 {
//	int = cijfer
	private int y = 3;
	
//	functie om iets te printen
	H11_Quiz1_file2() {
//		x plus 2
		x += 2;
//		y plus 1
		y++;
//		geeft de waarden x en y weer
		System.out.print(x + ", " + y);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H11_Quiz1_file2 sk = new H11_Quiz1_file2();
	}
}
