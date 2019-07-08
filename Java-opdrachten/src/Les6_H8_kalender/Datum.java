package Les6_H8_kalender;


public class Datum {
//	int = cijfers
//	private betekent dat ze alleen toegankelijk zijn vanuit de klass Datum
	private int dag;
	private int maand;
	private int jaar;
	
//	 construcotr voor lege inhoud
	public Datum() {
		
	}
//	constructor voor inhoud
	public Datum(int dag, int maand, int jaar) {
		this.dag = dag;
		this.maand = maand;
		this.jaar = jaar;
	}
	
//	Methode 
//	als we deze methode aan roepen, en dag, maand en jaar zijn ingevuld
//	print hij dus de waarden uit zoals hier onder staat beschreven
	public void datumFormaat() {
//		hoe het weer wordt gegevens: dag-maand-jaar
		System.out.println(dag + "-" + maand + "-" + jaar);
	}
//	test
//	public static void main(String[] args) {
//		Datum td = new Datum(19, 4, 2016);
//		td.myMethod();
//	}
}
