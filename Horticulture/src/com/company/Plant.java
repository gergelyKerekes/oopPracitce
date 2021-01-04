package com.company;

public abstract class Plant {

    private String name;
    private int growth;
    private int maxGrowth;
    private boolean isAlive = true;


    public Plant (String name, int growth, int maxGrowth) {
        this.name = name;
        this.growth = growth;
        this.maxGrowth = maxGrowth;
    }

    public void gardening (FeedStuff feedStuff){}

    public void nourishment(FeedStuff feedStuff) {
        if(isAlive) {
            gardening(feedStuff);
            checkAlive();
        }
    }

    public void checkAlive (){
        if (growth <= 0 || growth >= maxGrowth){
            isAlive = false;
        }
    }

    @Override
    public String toString() {
        return "Species: " + getClass().getSimpleName() +
                ", name: " + getName() +
                ", growth: " + getGrowth() +
                ", Is alive: " + isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getMaxGrowth() {
        return maxGrowth;
    }

    public void setMaxGrowth(int maxGrowth) {
        this.maxGrowth = maxGrowth;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
