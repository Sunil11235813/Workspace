package com.assessment.ColoringService.ColorPalettes;

public class GreenColor implements Color{

    private String color;

    public GreenColor(){}
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

