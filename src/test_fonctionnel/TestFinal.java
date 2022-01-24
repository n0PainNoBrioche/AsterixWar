package test_fonctionnel;

import Personnage.Druide;
import Personnage.Equipement;
import Personnage.Gaulois;
import Personnage.Romain;

public class TestFinal {
	public static void main(String[] args) {
		Druide druide = new Druide(5, 10);
		druide.Parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.Parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.Parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.Parler("UN GAU... UN GAUGAU...");
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		for (int i = 0; i < 2; i++) {
			asterix.Frapper(minus);
		}
	}
}