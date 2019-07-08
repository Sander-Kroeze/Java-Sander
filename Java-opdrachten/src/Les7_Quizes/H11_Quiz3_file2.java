package Les7_Quizes;

// breid de class file1 uit
public class H11_Quiz3_file2 extends H11_Quiz3_file1 {
//	karakter met G als waarde
	char c2 = 'A';
	
//	functie 
	H11_Quiz3_file2() {
//		geef 'N' weer als standaarduitvoer
		this('N');
//		geeft c2 weer
		System.out.print(c2);
	}
	
//	functie dat c weer geeft
	H11_Quiz3_file2(char c) {
//		geeft c weer
		System.out.print(c);
	}
	
	void mijnMethode() {
//		roept mijnMethode aan die in file1 staat
		super.mijnMethode();
//		geeft a weer
		System.out.print(c2);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H11_Quiz3_file2 subk = new H11_Quiz3_file2();
//		object roept mijnMethode aan die in file 2 staat(dit bestand)
		subk.mijnMethode();
	}
}
