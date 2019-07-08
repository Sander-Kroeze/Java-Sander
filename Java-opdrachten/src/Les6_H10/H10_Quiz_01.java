package Les6_H10;

public class H10_Quiz_01 {
//	int = cijfer
	int nr;  // instantieveriabele
	static int stNr; // klassenvariabele
	
//	constructor
//	deze constructor wordt iedere keer aangeroepen als we nieuwe objecten maken
//	omdat stNr static is blijft hij dus waarde: "1" houden als we een object aan maken
//	nr wordt iedere keer gerest
	public H10_Quiz_01() {
		nr++;
		stNr++;
	}
	
	public static void main(String[] args) {
//		maken van nieuwe objecten
		H10_Quiz_01 wn1 = new H10_Quiz_01();
		H10_Quiz_01 wn2 = new H10_Quiz_01();
		H10_Quiz_01 wn3 = new H10_Quiz_01();
//		laat de resultaten zien
		System.out.print(H10_Quiz_01.stNr + ", ");
		System.out.print(wn1.nr + ", ");
		System.out.print(wn2.nr + ", ");
		System.out.print(wn3.nr);
	}
}
