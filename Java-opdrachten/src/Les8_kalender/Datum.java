package Les8_kalender;


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
	
//	de mehtode 
	public void myMethod() {
//		hoe het weer wordt gegevens
		System.out.println(dag + "-" + maand + "-" + jaar);
	}
//	test
//	public static void main(String[] args) {
//		Datum td = new Datum(19, 4, 2016);
//		td.myMethod();
//	}
}
