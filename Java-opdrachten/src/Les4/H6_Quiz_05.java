package Les4;

public class H6_Quiz_05 {
//	dollarkoers
//	double = cijfers met getallen achter de comma
	double euro = 0.907; // $1 = € 0.907
	double engelsePond = 0.762; // $1 = 0.7652 Pnd
	double zwitserseFranc = 0.986; // $1 = 0986 CHF
	double chinseseYuan = 6.674; // $1 = 6.674 Yuan
	double russischeRoebel = 64.456; //$1 = 64.456 RUB
	
	public void omrekenenNaarDollar(char valuta, int bedrag) {
//		switch voor valute te controleren
		switch(valuta) {
//		als valuta 'e' is
		case ('e'):
//			geef bedrag keer euro weer
			System.out.print(bedrag * euro);
//			stop
			break;
//		enz.
		case ('p'):
			System.out.print(bedrag * engelsePond);
			break;
		case ('f'):
			System.out.print(bedrag * zwitserseFranc);
			break;
		case ('y'):
			System.out.print(bedrag * chinseseYuan);
			break;
		case ('r'):
			System.out.print(bedrag * russischeRoebel);
			break;
		default:
			System.out.print("Ongeldig");
		}
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object aan
		H6_Quiz_05 val = new H6_Quiz_05();
//		roept omrekenenNaar Dollar aan met 2 parameters om te kijken wat de uitkomst is
		val.omrekenenNaarDollar('f', 100);
	}
}
