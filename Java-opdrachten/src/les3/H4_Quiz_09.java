package les3;

public class H4_Quiz_09 {
	public static void main(String[] args) {
//		doe dit zolang jaar kleiner of gelijk is aan 2001
		for(int jaar = 1993; jaar <= 2001; jaar++) {
//			als jaar % 4 niet gelijk is aan 0
			if((jaar % 4 != 0)) {
//				ga verder
				continue;
			}
//			geef variable jaar weer1
			System.out.print(jaar +  " ");
		}
	}
}
