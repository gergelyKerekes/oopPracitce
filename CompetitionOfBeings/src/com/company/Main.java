package com.company;

import com.company.competitionofbeings.*;


public class Main {

    public static void main(String[] args) {
        Being being1 = new SandWalker("Vandor", 4);
        Being being2 = new Stepper("Seta", 7);
        Being being3 = new Spongey("Csuszo", 12);
        Being being4 = new Spongey("Siklo", 10);

        Competition comp = new Competition();
        comp.addBeing(being1);
        comp.addBeing(being2);
        comp.addBeing(being3);
        comp.addBeing(being4);

        System.out.println(comp.toString());

        Weather[] weathers = new Weather[]{Weather.SUNNY, Weather.CLOUDY, Weather.CLOUDY,
                                        Weather.RAINY, Weather.RAINY, Weather.RAINY,
                                        Weather.SUNNY, Weather.SUNNY, Weather.CLOUDY};

        for ( Weather weather: weathers) {
            comp.aDaysProgress(weather);
            System.out.println("Today's weather is " + weather.toString());
            System.out.println(comp.toString());
        }

    }
}
