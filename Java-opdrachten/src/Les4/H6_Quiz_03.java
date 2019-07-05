package Les4;

public class H6_Quiz_03 {
	int i = 3;
	int i2 = 8;
	
//	nieuw constructor
	public H6_Quiz_03() {
		i += 4;
		i2 += 2;
	}
	
//	hier wordt het restultaat geprint
	public void print() {
		int x = i + i2;
		System.out.print(x);
	}
	
	public static void main(String[] args) {
//		nieuw object wordt aangemaakt
		H6_Quiz_03 mk = new H6_Quiz_03();
//		het object roebt print aan en print de resultaten
		mk.print();
	}
}
