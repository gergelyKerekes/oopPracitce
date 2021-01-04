package com.company;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    List<Plant> plants = new ArrayList<>();

    public void addPlant (Plant plant) {
        plants.add(plant);
    }

    public void development (FeedStuff feedStuff){
        for (Plant plant: plants){
            plant.nourishment(feedStuff);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Plant plant: plants) {
            sb.append(plant.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
