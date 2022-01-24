package test_fonctionnel;

import java.util.ArrayList;
import java.util.Random;

import Personnage.Gaulois;
import Personnage.Romain;
import Personnage.Druide;

public class Bataille {
    private ArrayList<Gaulois> campsGaulois = new ArrayList<Gaulois>(5);
    private ArrayList<Romain> campsRomain = new ArrayList<Romain>(5);

    public void addGaulois(Gaulois perso){
            campsGaulois.add(perso);
    }
    public void addRomain(Romain perso){
            campsRomain.add(perso); 
    }
    public void displayGaulois(){
        System.out.println("Le camps gaulois est composé de :");
        for(int i = 0; i < campsGaulois.size(); i++){
            System.out.println("- "+campsGaulois.get(i).getName());
        }
    }
    public void displayRomain(){
        System.out.println("Le camps romain est composé de :");
        for(int i = 0; i < campsRomain.size(); i++){
            System.out.println("- "+campsRomain.get(i).getName());
        }
    }
    public int getCampsGaulois(){
        int i = campsGaulois.size();
        return i;
    }
    public int getCampsRomain(){
        int i = campsRomain.size();
        return i;
    }
    public void guerre(Druide druide){
        if(campsGaulois.size() == 0 || campsRomain.size() == 0){
            if(campsRomain.size() == 0){
                System.out.println("Rentrons pour aller préparer un grand festin");
                System.exit(00);
            } else if(campsGaulois.size() == 0){
                System.out.println("César, nous avons enfin soumis la Gaule");
                System.exit(00);
            }
        } else {
            Random combat = new Random();
            int i = combat.nextInt(campsGaulois.size());
            int j = combat.nextInt(campsRomain.size());
            Gaulois guerrierGaulois = campsGaulois.get(i);
            Romain guerrierRomain = campsRomain.get(j);
            if(guerrierGaulois.getStrenght() > guerrierRomain.getStrenght()){
                guerrierGaulois.Frapper(guerrierRomain);
                if(guerrierRomain.getStrenght() == 0){
                    campsRomain.remove(guerrierRomain);
                }
            } else {
                if(guerrierGaulois.getEffetPotion() == 1){
                    druide.booster(guerrierGaulois);
                } else {
                    campsGaulois.remove(guerrierGaulois);
                }
            }
        }
    }
}
