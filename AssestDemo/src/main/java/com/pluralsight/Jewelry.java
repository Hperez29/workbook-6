package com.pluralsight;

public class Jewelry extends FixedAsset {

    private double karat;

    public Jewelry(String name, double marketValue, double karat) {
        super();
        this.karat = karat;
    }



    @Override
    public double getValue() {
        return 15 * karat;
    }
}
