package Les8_Quiz1;

public class MijnKlasse implements MijnInterface {
	public void methode() {
//		x++; 
		System.out.print(x);
	}
	
	public void methode(int i) {
		int z = i;
		z = z+ x;
		System.out.print(z);
	}
	
	public static void main(String[] args) {
		new MijnKlasse().methode(4);
	}
}
