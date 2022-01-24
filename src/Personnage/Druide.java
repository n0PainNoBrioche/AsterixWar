package Personnage;

import java.util.Random;

public class Druide {
    private int forcePotion = 0;
    private int FORCE_POTION_MIN;
    private int FORCE_POTION_MAX;

    public Druide(int FORCE_POTION_MIN, int FORCE_POTION_MAX){
        this.FORCE_POTION_MIN = FORCE_POTION_MIN;
        this.FORCE_POTION_MAX = FORCE_POTION_MAX;
    }
    public void Parler(String phrase){
        System.out.println("Le druide "+phrase);
    }
    public void preparerPotion(){
        Random random = new Random();
        forcePotion = random.nextInt(FORCE_POTION_MIN,FORCE_POTION_MAX);
        if(forcePotion > 7){
            System.out.println("Le druide : J'ai préparé une super potion de force "+forcePotion);
        } else {
            System.out.println("Le druide : Je n'ai pas trouvé tous les ingrédients ma potion est seulement de force "+forcePotion);
        }
    }
    public int getForcePotion(){
        return forcePotion;
    }
    public void booster(Gaulois perso){
        if(perso.getName() == "Obélix"){
            System.out.println("Le druide : Non, Obélix !... Tu n’auras pas de potion magique !");
        } else {
            perso.boirePotion(forcePotion);
        }
    }
}
