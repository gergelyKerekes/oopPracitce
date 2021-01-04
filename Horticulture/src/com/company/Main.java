package com.company;

public class Main {

    public static void main(String[] args) {
	    Plant plant1 = new Flower("V102", 3);
	    Plant plant2 = new Bush("B223", 4);
	    Plant plant3 = new Cactus("K15", 2);
	    Plant plant4 = new Cactus("K18", 1);

        Garden garden = new Garden();
        garden.addPlant(plant1);
        garden.addPlant(plant2);
        garden.addPlant(plant3);
        garden.addPlant(plant4);

        System.out.println(garden.toString());

        FeedStuff[] feeds = new FeedStuff[]{FeedStuff.WATER, FeedStuff.BROTH, FeedStuff.NONE,
                                            FeedStuff.WATER, FeedStuff.FERTILIZER};

        for (FeedStuff feed : feeds) {
            garden.development(feed);
            System.out.println("Today's feedstuff: " + feed.toString());
            System.out.println(garden.toString());
        }
    }
}

