package com.company;

public class Bush extends Plant{

    private final int MAXGROWTH = 10;

    public Bush (String name, int growth) {
        super(name, growth, 10);
    }

    @Override
    public void gardening(FeedStuff feedStuff) {
        switch(feedStuff) {
            case WATER:
            case FERTILIZER:
                if (getGrowth() + 1 >= MAXGROWTH) {
                    setGrowth(MAXGROWTH);
                } else {
                    setGrowth(getGrowth() + 1);
                }
                break;
            case BROTH:
            case NONE:
                setGrowth(getGrowth() - 1);
                checkAlive();
                break;
        }
    }
}
