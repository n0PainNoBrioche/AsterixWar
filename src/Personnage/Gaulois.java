package Personnage;

public class Gaulois {
    private String name;
    private int strenght;
    private int origin_strenght;
    private int effetPotion = 1;

    public Gaulois(String name, int strenght) {
        this.name = name;
        this.strenght = strenght;
        origin_strenght = strenght;
    }
    public String getName(){
        return name;
    }
    public int getStrenght() {
        return strenght;
    }  
    public int getEffetPotion(){
        return effetPotion;
    }
    public void Parler(String phrase){
        System.out.println("Le gaulois "+name+" : "+phrase);
    }
    public void Frapper(Romain romain){
        System.out.println(name+" envoie un grand coup dans la mâchoire de "+romain.getName());
        strenght = getStrenght()*effetPotion;
        romain.recevoirCoup(strenght/3);
        if(strenght > origin_strenght){
            strenght--;
        } 
    }
    public void boirePotion(int forcePotion){
        effetPotion = forcePotion;
        System.out.println("Le gaulois "+name+" : Merci Druide, je sens que ma force est décuplée.");
    }
    // public static void main(String[] args) {
    //     Gaulois asterix = new Gaulois("Asterix", 8);
    //     asterix.Parler("Bonjour à tous");
    // }
}
