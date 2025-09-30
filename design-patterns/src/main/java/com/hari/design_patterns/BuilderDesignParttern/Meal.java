package com.hari.design_patterns.BuilderDesignParttern;

public class Meal {


    private String curry ;
    private String coldDrink;
    private String biryani;
    private String sweet;

    public String getCurry() {
        return curry;
    }

    public void setCurry(String curry) {
        this.curry = curry;
    }

    public String getColdDrink() {
        return coldDrink;
    }

    public void setColdDrink(String coldDrink) {
        this.coldDrink = coldDrink;
    }

    public String getBiryani() {
        return biryani;
    }

    public void setBiryani(String biryani) {
        this.biryani = biryani;
    }

    public String getSweet() {
        return sweet;
    }

    public void setSweet(String sweet) {
        this.sweet = sweet;
    }
}
