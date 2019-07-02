package Les2;

public class H2_Quiz_5 {
	public static void main(String[] args) {
//		boolean isDefect = true;
//		vragen
		boolean isDefect = false;
		int x = 1;
//		einde vragen
//		int x = 2;
		int y = 7;
		int z = 9;
		
		if(x < y && x > 1) {
			System.out.print("N");
		}
		
		if(z > y || x > y) {
			System.out.print("O");
		}
		
		if(! isDefect) {
			System.out.print("P");
		}
	}
}
