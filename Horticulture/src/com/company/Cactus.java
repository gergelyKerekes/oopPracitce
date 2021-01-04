package com.company;

public class Cactus extends Plant{

    private final int MAXGROWTH = 4;

    public Cactus (String name, int growth) {
        super(name, growth, 4);
    }

    @Override
    public void gardening(FeedStuff feedStuff) {
        switch (feedStuff){
            case WATER:
            case NONE:
                setGrowth(getGrowth() - 1);
                checkAlive();
                break;
            case BROTH:
            case FERTILIZER:
                if (getGrowth() + 1 >= MAXGROWTH){
                    setGrowth(MAXGROWTH);
                }else {
                    setGrowth(getGrowth() + 1);
                }
                break;
        }
    }
}
