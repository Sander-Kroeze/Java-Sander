package Les4;

public class H5_Quiz_02 {
//	int = cijfer
	int x;
	int y = 7;
	
	public static void main(String[] args) {
//		maakt een nieuw object aan 
		H5_Quiz_02 mk = new H5_Quiz_02();
//		geeft waarden aan het object
		mk.x = 5;
		mk.y = 8;
//		maakt een nieuw object aan
		H5_Quiz_02 mk2 = new H5_Quiz_02();
//		maakt een nieuw object aan met de waarden van mk
		H5_Quiz_02 mk3 = mk;
//		geeft de variabelen mk.x, mk2.x en mk3.y terug
		System.out.print(mk.x + ", " + mk2.x + ", " + mk3.y);
	}
}
