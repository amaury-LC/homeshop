package com.alc.HomeShop.paris;

public class Taxi implements MoyenDeLocomotion {
    @Override
    public void deplace(String adresse) {

        System.out.println("Je suis un taxi et je vais à l'adresse : " + adresse);
    }
}
