package test_fonctionnel;

import Personnage.Equipement;
//import Personnage.Romain;
import Personnage.Romain;

public class TestIntermediare {
    public static void main(String[] args) {
        Romain minus = new Romain("Minus", 6);

        System.out.println(Equipement.CASQUE);
        System.out.println(Equipement.BOUCLIER);
        minus.sEquiper(Equipement.CASQUE);
        // minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        // minus.sEquiper(CASQUE);
        minus.recevoirCoup(19);
        
    }
    
}
