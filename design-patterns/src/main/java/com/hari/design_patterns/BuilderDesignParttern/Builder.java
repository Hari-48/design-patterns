package com.hari.design_patterns.BuilderDesignParttern;

public interface Builder {


    void addCurry();
    void addColdDrink();
    void addBiryani();
    void addSweat();

     Meal getMeal();

}
