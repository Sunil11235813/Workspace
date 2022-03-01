package com.assessment.ColoringService.ColorPalettes;

public class RedColor implements Color{

    private String color;

    public RedColor(){}
    @Override
    public void setColorValue(String colorValue){
        this.color = colorValue;
    }

    @Override
    public String getColorValue() {
        return this.color;
    }
    @Override
    public String toString() {
        return this.color;
    }
}

