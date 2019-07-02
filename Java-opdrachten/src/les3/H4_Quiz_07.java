package les3;

public class H4_Quiz_07 {
	public static void main(String[] args) {
//		char zijn strings
		char c = 'a';
		char c2 = 'b';
//		doe dit zo lang i groter of gelijk is aan nul
		for(int i = 4; i >= 0; i --) {
//			als i groter of gelijk is aan drie of als i gelijk is aan 1
			if(i >= 3 || i == 1) {
//				geef c2 weer
				System.out.print(c2);
//			anders
			} else {
//				geef c weer
				System.out.print(c);
			}
		}
	}
}
