package com.designpattern.builder;
public class BuilderPatternExample {
    public static void main(String[] args) {
        House house1 = new House.HouseBuilder("Concrete", "Wood", "Tiles")
                .setGarage(true)
                .setSwimmingPool(false)
                .setStatues(true)
                .setGarden(true)
                .build();

        House house2 = new House.HouseBuilder("Concrete", "Steel", "Shingles")
                .setGarage(false)
                .setSwimmingPool(true)
                .build();

        System.out.println(house1);
        System.out.println(house2);
    }
}
