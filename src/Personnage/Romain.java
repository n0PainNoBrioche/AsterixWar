package Personnage;

public class Romain {
    private String name;
    private int strenght;
    private Equipement[] equipements = new Equipement[2];
    private int nbEquipement = 0;

    public Romain(String name, int strenght) {
        this.name = name;
        this.strenght = strenght;
    }
    public String getName(){
        return name;
    }
    public int getStrenght() {
        return strenght;
    }      
    public void Parler(String phrase){
        System.out.println("Le Romain "+getName()+" : "+phrase);
    }

    public void recevoirCoup(int damage){
        for(int i = 0; i < 2; i++){
            if(equipements[i]==Equipement.CASQUE){
                damage = damage - 5;
            } else if(equipements[i]==Equipement.BOUCLIER){
                damage = damage - 8;
            }
        }
        this.strenght = getStrenght()-damage;
        if(getStrenght()<0){
            this.strenght = 0;
        }
        if(getStrenght()>0){
            Parler("Aïe !");
        } else {
            Parler("J’abandonne…");
        }
        
    }

    public void sEquiper(Equipement equip){
        switch(nbEquipement){
            case 2:
                System.out.println("Le soldat "+getName()+" est déjà bien protégé !");
                break;
            
            case 1:
                if(equip == Equipement.CASQUE && equipements[0] == Equipement.CASQUE){
                    System.out.println("Le soldat "+getName()+" possède déjà un casque");
                } else if(equip == Equipement.CASQUE && equipements[0] != Equipement.CASQUE){
                    System.out.println("Le soldat "+getName()+" s'équipe avec un "+equip.getEquipement());
                    equipements[0] = Equipement.CASQUE;
                    nbEquipement++;
                }
                if(equip == Equipement.BOUCLIER && equipements[1] == Equipement.BOUCLIER){
                    System.out.println("Le soldat "+getName()+" possède déjà un bouclier");
                } else if(equip == Equipement.BOUCLIER && equipements[1] != Equipement.BOUCLIER){
                    equipements[1] = Equipement.BOUCLIER;
                    System.out.println("Le soldat "+getName()+" s'équipe avec un "+equip.getEquipement());
                    nbEquipement++;
                }
                break;
            case 0:
                equipements[0]=equip;
                System.out.println("Le soldat "+getName()+" s'équipe avec un "+equip.getEquipement());
                nbEquipement++;
                break;
        }
    }
}
