package Les4;

public class H6_Quiz_02 {
//	int = cijfers
	int i = 5;
	int i2 = 3;
	
	public int bereken() {
//		verhoogt i met 1
		i ++;
//		als i kleiner of gelijk = aan i2
		if(i <= i2) {
//			geef i keer i2 terug
			return i * i2;
		}
//		als i + i2 groter of gelijk is aan 9
		else if((i + i2) >= 9) {
//			geef i + i2 + 5 terug
			return i + i2 + 5;
		}
//		geef i keer i2 + 3 terug
		return i * i2 + 3;
	}
	
	public static void main(String[] args) {
//		nieuw object aan maken
		H6_Quiz_02 mk = new H6_Quiz_02();
//		resultaat van bereken()
		System.out.print(mk.bereken());
	}
}
