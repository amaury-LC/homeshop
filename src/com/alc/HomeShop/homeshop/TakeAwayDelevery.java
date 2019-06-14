package com.alc.HomeShop.homeshop;

public class TakeAwayDelevery implements Delivery {
    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public String getinfo() {
        return "retrait 0.00€";
    }
}
