package com.pluralsight;

public class Gold extends FixedAsset{

    private final String name1;
    private final double marketValue1;
    private final double weight;

    public Gold(String name, double marketValue, double weight) {
        super();
        name1 = name;
        marketValue1 = marketValue;
        this.weight = weight;
    }

    @Override
    public double getValue(){
            return weight * 33;
        }

    public double getMarketValue1() {
        return marketValue1;
    }
}
