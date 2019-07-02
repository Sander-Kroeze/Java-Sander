package les3;

public class H3_Quiz_08 {
	public static void main(String[] args) {
//		int = cijfer
		int x = 8;
//		controleert variable x
		switch(x) {
		case 6:
			x += 5;
		case 7:
			x += 3;
		case 8:
			x +=2;
		case 9:
			x++;
			break;
		default:
			x += 4;
		}
//		geeft variable x weer
		System.out.print(x);
	}
}