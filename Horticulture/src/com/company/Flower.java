package com.company;

public class Flower extends Plant{

    private final int MAXGROWTH = 6;

    public Flower (String name, int growth) {
        super(name, growth, 6);
    }

    @Override
    public void gardening(FeedStuff feedStuff) {

        switch (feedStuff) {
            case WATER:
                if (getGrowth() + 3 >= MAXGROWTH) {
                    setGrowth(MAXGROWTH);
                } else {
                    setGrowth(getGrowth() + 3);
                }
                break;
            case BROTH:
            case FERTILIZER:
            case NONE:
                setGrowth(getGrowth() - 1);
                checkAlive();
                break;
        }
    }
}

