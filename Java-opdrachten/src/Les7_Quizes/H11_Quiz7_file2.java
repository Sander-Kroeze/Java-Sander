package Les7_Quizes;

// breid class file 1 uit
public class H11_Quiz7_file2 extends H11_Quiz7_file1 {
//	functie met 1 parameter
	H11_Quiz7_file2(String naam) {
//		super roept de constructer aan van de file1 class en geeft argument x en d er aan door
		super(naam);
//		geef naam weer
		System.out.print(naam);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan met de parameter: "X"
		H11_Quiz7_file2 sk = new H11_Quiz7_file2("X");
	}
}
