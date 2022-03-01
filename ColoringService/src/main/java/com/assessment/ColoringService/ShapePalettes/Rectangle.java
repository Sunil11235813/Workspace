package com.assessment.ColoringService.ShapePalettes;

import com.assessment.ColoringService.ColorPalettes.*;

import java.util.UUID;

public class Rectangle extends Shape{
    private static StringBuilder initialVal ;
    private Shape drawShape;

    public Rectangle(){}
    public Rectangle(YellowColor color){
        //TO-DO
    }

    @Override
    public Shape draw() {
        return this.drawShape;
    }
    @Override
    public int hashCode() {
        return 31* UUID.randomUUID().hashCode();
    }
    @Override
    public String toString() {
        return new StringBuilder()
                .append("[  SHAPE NAME :\t")
                .append(this.drawShape.getClass().getSimpleName()).append(" \t SHAPE COLOR : \t")
                .append(this.drawShape.getFillColor().toString().toLowerCase())
                .append(" ] ")
                .toString();
    }
}
