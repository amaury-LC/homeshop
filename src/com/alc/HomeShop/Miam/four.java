package com.alc.HomeShop.Miam;

public class four {

    int puissance;
    int capacite;

    public void cuire(Aliment Aliment){

        System.out.println("Je cuis un aliment : " + Aliment.nom);
        System.out.println("avec ma capacité de " + capacite + " litres");
        System.out.println("et ma puissance de " + puissance + " degrés.");
        Aliment.estCuit = true;


    }
}
