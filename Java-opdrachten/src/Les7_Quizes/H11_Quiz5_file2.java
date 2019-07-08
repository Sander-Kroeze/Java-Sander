package Les7_Quizes;

// breid file 1 uit
public class H11_Quiz5_file2 extends H11_Quiz5_file1 {
//	functie met twee parameters
	int mijnMethode(int i, int i2) {
//		geeft mijMethode(i) + x + i2 terug
		return mijnMethode(i) + x + i2;
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H11_Quiz5_file2 subK = new H11_Quiz5_file2();
//		geeft subK.mijnMethode weer met 2 parameters: i = 3 en i2 = 6
		System.out.print(subK.mijnMethode(3, 6));
	}
}
