package com.pluralsight;

public class Portfolio {
    private String name;
    private  String owner;
    private String assets;


    public Portfolio(String assets) {
        this.assets = assets;
    }
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void add(Gold gold) {
    }
}
