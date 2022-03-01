package com.assessment.ColoringService.ColorPalettes;

public class YellowColor implements Color{

    private String color;

    public YellowColor(){}
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

