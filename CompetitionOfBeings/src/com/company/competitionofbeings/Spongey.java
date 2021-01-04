package com.company.competitionofbeings;

public class Spongey extends Being{

    private final int MAXWATERRESOURCE = 20;

    public Spongey (String name, int waterResource){
        super(name,waterResource, 20, 0);
    }

    @Override
    public void move(Weather weather) {
        switch(weather) {
            case SUNNY:
                setWaterResource(getWaterResource() - 4);
                checkAlive();
                setDistance(getDistance());
                break;
            case CLOUDY:
                setWaterResource(getWaterResource() - 1);
                checkAlive();
                setDistance(getDistance() + 1);
                break;
            case RAINY:
                if (getWaterResource() + 6 >= MAXWATERRESOURCE) {
                    setWaterResource(MAXWATERRESOURCE);
                } else {
                    setWaterResource(getWaterResource() + 6);
                }
                setDistance(getDistance() + 3);
                break;
        }
    }
}
