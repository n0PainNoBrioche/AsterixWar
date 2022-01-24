package test_fonctionnel;

import Personnage.Druide;
import Personnage.Equipement;
import Personnage.Gaulois;
import Personnage.Romain;

public class Test {
    public static void main(String[] args) {

        Druide druide = new Druide(5,10);
        druide.Parler(": Je vais aller préparer une petite potion…");
        druide.preparerPotion();

        Gaulois asterix = new Gaulois("Asterix", 8);
        //System.out.println(asterix.getName());
        druide.booster(asterix);
        asterix.Parler("Bonjour à tous !");

        Gaulois obelix = new Gaulois("Obélix", 15);
        druide.booster(obelix);
        obelix.Parler("Par Bélénos, ce n'est pas juste !");

        Romain minus = new Romain("Minus", 6);
        //System.out.println(minus.getName());
        minus.Parler("UN GAU… UN GAUGAU… ");
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);

        for(int i = 0; i < 3; i++){
            //minus.recevoirCoup(3);
            asterix.Frapper(minus);
        }
    }
}
