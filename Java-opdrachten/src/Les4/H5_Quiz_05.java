package Les4;

public class H5_Quiz_05 {
//	int = cijfer
	int x = 3;
	int y = 5;
//	als er geen input is gegeven bij het maken van een nieuw object
//	worden de onderste waarden toegekend
//	alleen x wordt over geslagen
	H5_Quiz_05() {
		this(4,6);
	}
	
//	hier veranderd alleen y, omdat met x niks is gedaan
	H5_Quiz_05(int x, int y) {
		this.y = y;
	}
	
	public static void main(String[] args) {
//		nieuw object mk, met geen waardes
		H5_Quiz_05 mk = new H5_Quiz_05();
//		nieuw object mk2, met de waarde 9 en 7
//		alleen met 9 wordt niks gedaan omdat dit niet verteld wordt dat dit moet
//		met 7 echter wel , hier boven staat "this.y = y" dit betekent dat als 
//		y is ingevult zoals hier onder dat y dus y wordt
		H5_Quiz_05 mk2 = new H5_Quiz_05(9,7);
//		geeft de waarden weer
		System.out.print(mk.x + ", " + mk.y + ", "+ mk2.x + ", " + mk2.y);
				
	}
}
