package com.pluralsight;

public abstract class FixedAsset {
    public String name;
    public double marketValue;

    public FixedAsset(){
        this.name = name;
        this.marketValue = marketValue;
    }

    public abstract double getValue();

}

