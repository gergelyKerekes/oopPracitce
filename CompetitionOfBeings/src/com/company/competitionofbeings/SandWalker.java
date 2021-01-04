package com.company.competitionofbeings;

public class SandWalker extends Being{

    private final int MAXWATER = 8;

    public SandWalker (String name, int waterResource) {
        super(name, waterResource, 8, 0);
    }

    @Override
    public void move(Weather weather) {
        switch (weather){
            case SUNNY:
                setWaterResource(getWaterResource() - 1);
                checkAlive();
                setDistance(getDistance() + 3);
                break;
            case CLOUDY:
                setWaterResource(getWaterResource());
                setDistance(getDistance() + 1);
                break;
            case RAINY:
                if (getWaterResource() + 3 >= MAXWATER) {
                    setWaterResource(MAXWATER);
                } else {
                    setWaterResource(getWaterResource() + 3);
                }
                setDistance(getDistance());
                break;
        }
    }
}
