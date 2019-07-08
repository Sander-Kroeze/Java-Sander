package Les5;

public class H7_Quiz_06 {
//	stringbuffer-objecten
	StringBuffer sb = new StringBuffer();
	StringBuffer sb2 = new StringBuffer("Eva");
//	methode
	public void mijnMethode() {
//		voegt de string toe aan sb
		sb.append("Sam ");
//		voegt de string toe aan sb2
		sb2.append(" Lucas");
//		voegt een int toe aan de string
		sb.append(22);
		System.out.print(sb + ", " + sb2);
	}
	
	public static void main(String[] args) {
//		maakt een nieuw object
		H7_Quiz_06 mk = new H7_Quiz_06();
//		object roebt de methode aan
		mk.mijnMethode();
	}
}
