package Les7_Quizes;

// breid class file1 uit
public class H11_Quiz2_file2 extends H11_Quiz2_file1 {
//	functie om x te verhogen met y
	H11_Quiz2_file2(int y) {
//		x plus y
		x += y;
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan met een para meter van 4
		H11_Quiz2_file2 sk = new H11_Quiz2_file2(4);
//		geeft x weer
		System.out.print(sk.x);
	}
}
