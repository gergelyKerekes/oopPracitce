package com.company.competitionofbeings;

public class Stepper extends Being {

    private final int MAXWATERSRESOURCE = 12;

    public Stepper (String name, int waterResource) {
        super(name,waterResource, 12, 0);
    }

    @Override
    public void move(Weather weather) {
        switch (weather) {
            case SUNNY:
                setWaterResource(getWaterResource() - 2);
                checkAlive();
                setDistance(getDistance() + 1);
                break;
            case CLOUDY:
                setWaterResource(getWaterResource() - 1);
                checkAlive();
                setDistance(getDistance() + 2);
                break;
            case RAINY:
                if (getWaterResource() + 3 >= MAXWATERSRESOURCE){
                    setWaterResource(MAXWATERSRESOURCE);
                } else {
                    setWaterResource(getWaterResource() + 3);
                }
                setDistance(getDistance() + 1);
                break;
        }
    }
}
