package Les8_Quiz2;

public class MijnKlasse implements InterfaceA, InterfaceB {
//	int MAX_TOEGESTAAN;
	int z = 2;
	
	public void mijnMethode() {
		z = MAX_TOEGESTAAN + 4;
		System.out.print("H");
	}
	
	public void lmijnMethode(char j) {
//		MAX_TOEGESTAAN += 3;
		mijnMethode();
		System.out.print(j);
		System.out.print(z);
	}
	
	public int som() {
		return MAX_TOEGESTAAN + z;
	}
	
	public static void main(String[] args) {
		MijnKlasse mk = new MijnKlasse();
		mk.lmijnMethode('k');
	}
}
