package com.company;

import com.company.competitionofbeings.Being;
import com.company.competitionofbeings.Weather;

import java.util.ArrayList;
import java.util.List;

public class Competition {

    List<Being> beings = new ArrayList<>();

    public void addBeing (Being being) {
        beings.add(being);
    }

    public void aDaysProgress(Weather weather){
        for (Being being : beings){
            being.waterModified(weather);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Being being: beings) {
            sb.append(being.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
