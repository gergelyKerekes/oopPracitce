package com.company.competitionofbeings;

public class Being {

    private String name;
    private int waterResource;
    private final int maxWater;
    private int distance;
    private boolean isAlive = true;


    public Being (String name, int waterResource, int maxWater, int distance){
        this.name = name;
        this.waterResource = waterResource;
        this.maxWater = maxWater;
        this.distance = distance;
    }

    public void move(Weather weather){}

    public void waterModified(Weather weather) {
        if(isAlive) {
            move(weather);
        }
    }

    public void checkAlive() {
        if (waterResource <= 0){
            isAlive = false;
        }
    }

    @Override
    public String toString() {
        return "Species: " + getClass().getSimpleName() +
                ", name: " + getName() +
                ", waterResource: " + getWaterResource() +
                ", distance: " + getDistance() +
                ", Is alive: " + isAlive;
    }

    public String getName() {
        return name;
    }

    public int getWaterResource() {
        return waterResource;
    }

    public void setWaterResource(int waterResource) {
        this.waterResource = waterResource;
    }

    public int getMaxWater() {
        return maxWater;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
