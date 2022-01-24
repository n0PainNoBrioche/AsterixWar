package test_fonctionnel;

import Personnage.*;

public class TestBataille {

    public static void main(String[] args) {

        Druide druide = new Druide(5,10);

        Gaulois asterix = new Gaulois("Asterix", 8);
        Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
        Gaulois agecanonix = new Gaulois("Agecanonix", 5);

        Romain minus = new Romain("Minus", 6);
        minus.sEquiper(Equipement.CASQUE);
        minus.sEquiper(Equipement.BOUCLIER);
        Romain chorus = new Romain("Chorus", 5);
        Romain faitexcus = new Romain("Faitexcus", 5);
        faitexcus.sEquiper(Equipement.CASQUE);
        faitexcus.sEquiper(Equipement.BOUCLIER);

        Bataille baston = new Bataille();
        baston.addGaulois(abraracourcix);
        baston.addGaulois(asterix);
        baston.addGaulois(agecanonix);
        baston.addRomain(minus);
        baston.addRomain(chorus);
        baston.addRomain(faitexcus);
        baston.displayGaulois();
        baston.displayRomain();
        while(true){
            baston.guerre(druide);
        } 
    }
    
}
