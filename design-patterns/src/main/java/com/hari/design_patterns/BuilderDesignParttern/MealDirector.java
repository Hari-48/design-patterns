package com.hari.design_patterns.BuilderDesignParttern;

public class MealDirector {

    private Builder builder;

    public MealDirector(Builder builder) {
        this.builder = builder;
    }

    public Meal prepareMeal(){
        builder.addBiryani();
        builder.addColdDrink();
        builder.addSweat();
        builder.addCurry();
        return builder.getMeal();

    }
}
