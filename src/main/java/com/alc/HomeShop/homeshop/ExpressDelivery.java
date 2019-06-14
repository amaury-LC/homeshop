package com.alc.HomeShop.homeshop;

import com.alc.HomeShop.homeshop.Delivery;

public class ExpressDelivery implements Delivery {

    private String city;

    public ExpressDelivery(String city) {
        this.city = city;
    }

    @Override
    public double getPrice() {
        if(this.city == "Paris"){

            return 6.99;
        }
        else{

            return 9.99;
        }
    }

    @Override
    public String getinfo() {
        return "livraison à domicile express à" + getPrice();
    }
}
