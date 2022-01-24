package Personnage;

public enum Equipement {
    CASQUE("casque"), BOUCLIER("bouclier");

    private String Equipement;

    private Equipement(String Equipement){
        this.Equipement = Equipement;
    }

    public String getEquipement(){
        return Equipement;
    }

}
