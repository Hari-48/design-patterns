package com.hari.design_patterns.BuilderDesignParttern;

public class NonVegMeal implements Builder {

    private Meal meal = new Meal();

    @Override
    public void addCurry() {
        meal.setCurry("NON VEG CURRY");
    }

    @Override
    public void addColdDrink() {
        meal.setColdDrink("KING FISHER");
    }

    @Override
    public void addBiryani() {
        meal.setBiryani("CHICKEN BIRYANI");

    }

    @Override
    public void addSweat() {
        meal.setSweet("HALWA");

    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
