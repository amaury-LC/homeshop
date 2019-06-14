package com.alc.HomeShop.miam;

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

    public com.alc.HomeShop.miam.resistance getResistance() {
        return resistance;
    }

    public com.alc.HomeShop.miam.soufflerie getSoufflerie() {
        return soufflerie;
    }

    private int puissance;
    private int capacite;
    private resistance resistance;
    private soufflerie soufflerie;

    public void cuire(Aliment Aliment,int temperature, int duree){

        if (temperature < 40 || temperature > 250)
            throw new IllegalArgumentException("La température du four doit être comprise en 40 et 250 degrés");
        if (duree <= 0)
            throw new IllegalArgumentException("La durée doit être positive");



        System.out.println("Je cuis un aliment : " + Aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        Aliment.estCuit = true;


    }
}
