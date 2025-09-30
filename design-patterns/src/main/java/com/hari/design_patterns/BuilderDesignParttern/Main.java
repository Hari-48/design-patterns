package com.hari.design_patterns.BuilderDesignParttern;

public class Main {

    public static void main(String[] args) {


        Burger burger = new Burger.BurgerBuilder()
                .mayonese(true)
                .onion(false)
                .egg(false)
                .extraCheese(true)
                .size("LARGE")
                .build();


        Meal nonVegMeal = new MealDirector(new NonVegMeal()).prepareMeal();
        System.out.println(nonVegMeal.getBiryani());
    }
}
