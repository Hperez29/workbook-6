package com.pluralsight;

public class House extends FixedAsset{
    private int yearBuilt;
    private  int squareFeet;
    private int bedRooms;
    
    public House(int squareFeet) {
        this();
        this.squareFeet = squareFeet;
    }

    public House() {
        super();
    }


    @Override
    public double getValue() {
        return 0;
    }
}
