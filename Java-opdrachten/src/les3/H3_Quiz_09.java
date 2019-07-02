package les3;

public class H3_Quiz_09 {
	public static void main(String[] args) {
//		int = cijfer
		int intMaand = 10;
//		maakt een lege variable aan genaamt strMaand
		String strMaand;
//		test intMaand
		switch(intMaand) {
		case 1:
			strMaand = "jan ";
		case 2:
			strMaand = "feb ";
		case 3:
			strMaand = "mrt ";
		case 4:
			strMaand = "apr ";
		case 5:
			strMaand = "mei ";
		case 6:
			strMaand = "jun ";
		case 7:
			strMaand = "jul ";
		case 8:
			strMaand = "aug ";
		case 9:
			strMaand = "sep ";
		case 10:
			strMaand = "okt ";
		case 11:
			strMaand = "nov ";
		case 12: 
			strMaand = "dec ";
			break;
		default:
			strMaand = "Ongeldig ";
		}
//		print strMaand
		System.out.println(strMaand);
	}
}
