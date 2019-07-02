package les3;

public class H4_Quiz_06 {
	public static void main(String[] args) {
//		int = cijfer
		int x = 1;
//		doe i+= 2 zo lang i kleiner is dan 7
		for(int i = 1; i < 7; i += 2) {
//			verhoog i met de waarde van i
			x += i;
		}
//		verlaag de waarde van x met 2
		x -= 2;
//		geef de variable x weer
		System.out.print(x);
	}
}
