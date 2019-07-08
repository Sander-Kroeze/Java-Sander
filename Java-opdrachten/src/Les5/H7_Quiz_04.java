package Les5;

public class H7_Quiz_04 {
//	string met text
	String str = "He$llo $World$";
//	methode
	public void mijnMethode() {
//		geeft de str weer waar de dollar tekens zijn vervangen door: "" niks
		System.out.println(str.replace("$", ""));
	}
	
	public static void main(String[] args) {
		H7_Quiz_04 mk = new H7_Quiz_04();
		mk.mijnMethode();
	}
}
