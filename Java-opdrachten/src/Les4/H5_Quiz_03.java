package Les4;

public class H5_Quiz_03 {
	int x = 2;
	int y = 5;
//	no-argument-constructor
	H5_Quiz_03() {
		
	}
//	een-argument-constructor
	H5_Quiz_03(int x) {
		this.y = x;
	}
//	twee-argumenten-constructor
	H5_Quiz_03(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public static void main(String[] args) {
//		mk heeft de standaard waarden van y en x
		H5_Quiz_03 mk = new H5_Quiz_03();
//		mk2 heeft een nieuwe x waarde (7) en van y de standaard waarde
		H5_Quiz_03 mk2 = new H5_Quiz_03(7);
//		mk3 heeft 2 nieuwe waarden, namijk x = 9 en y = 7
		H5_Quiz_03 mk3 = new H5_Quiz_03(9,3);
//		geeft de variabelen mk.y, mk2.y en mk3.x weer
		System.out.print(mk.y + ", " + mk2.y + ", " + mk3.x);
	}
}
