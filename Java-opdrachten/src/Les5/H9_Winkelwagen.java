package Les5;

import java.util.ArrayList;

public class H9_Winkelwagen {
//	maakt een array aan van de gegevens die in de public class staan
	ArrayList<H9_Opdracht> artikel = new ArrayList<H9_Opdracht>();
//	voegt gegevens toe aan het array
	public void productToevoegen() {
//		voeg nieuwe infomatie toe
		H9_Opdracht art1 = new H9_Opdracht("Overhemd", 20.39);
		H9_Opdracht art2 = new H9_Opdracht("Broek", 32.85);
		H9_Opdracht art3 = new H9_Opdracht("Sokken", 11.25);
		H9_Opdracht art4 = new H9_Opdracht("Jas", 120.65);
//		voeg ze toe aan het array
		artikel.add(art1);
		artikel.add(art2);
		artikel.add(art3);
		artikel.add(art4);
	}
//	dit is de print methode, dit laat het resultaat zien
	public void print() {
//		maakt een nieuw object aan
		H9_Winkelwagen mk = new H9_Winkelwagen();
//		roep productToevoegen aan
		mk.productToevoegen();
//		loopt door array heen
		for(int i = 0; i < mk.artikel.size(); i++) {
//			geeft de gegevens weer
			System.out.println(mk.artikel.get(i).naam + " prijs € "
					+ mk.artikel.get(i).prijs);
		}
	}
}
