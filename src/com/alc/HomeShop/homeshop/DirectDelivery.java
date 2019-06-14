package com.alc.HomeShop.homeshop;

public class DirectDelivery implements Delivery {
    @Override
    public double getPrice() {
        return 4.99;
    }

    @Override
    public String getinfo() {
        return "livraison à domicile 4.99";
    }


}
