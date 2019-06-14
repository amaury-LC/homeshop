package com.alc.HomeShop.homeshop;

import com.alc.HomeShop.homeshop.Delivery;

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
