package com.alc.HomeShop.Miam;

public class four {

    public int getPuissance() {
        return puissance;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public com.alc.HomeShop.Miam.resistance getResistance() {
        return resistance;
    }

    public com.alc.HomeShop.Miam.soufflerie getSoufflerie() {
        return soufflerie;
    }

    private int puissance;
    private int capacite;
    private resistance resistance;
    private soufflerie soufflerie;

    public void cuire(Aliment Aliment){

        System.out.println("Je cuis un aliment : " + Aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        Aliment.estCuit = true;


    }
}
