package com.hari.design_patterns.BuilderDesignParttern;

public class VegMealBuilder implements Builder{

    private Meal meal = new Meal();


    @Override
    public void addCurry() {
//        System.out.println("VEG CURRY");
        meal.setCurry("VEG CURRY");

    }

    @Override
    public void addColdDrink() {
//        System.out.println("PEPSI");
        meal.setColdDrink("PEPSI");
    }

    @Override
    public void addBiryani() {
//        System.out.println("VEG BIRYANI");
        meal.setBiryani("VEG BIRYANI");

    }

    @Override
    public void addSweat() {
//        System.out.println("LADDU");
        meal.setSweet("LADDU");
    }

    @Override
    public Meal getMeal() {
return meal;
    }
}
