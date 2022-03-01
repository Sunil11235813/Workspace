package com.assessment.ColoringService.ShapePalettes;

import com.assessment.ColoringService.ColorPalettes.*;

import java.util.UUID;

public class Square extends Shape{
    private static StringBuilder initialVal ;
    private Shape drawShape;

    public Square(){}
    public Square(YellowColor color){
        initialVal = new StringBuilder()
                .append("Initial SHAPE " +this.getClass().getSimpleName())
                .append("With Color "+color.getClass().getSimpleName());
        Rectangle resultShape = new Rectangle();
        resultShape.setFillColor(color);
        this.drawShape = resultShape;
    }

    public Square(RedColor color){
        initialVal = new StringBuilder()
                .append("Initial SHAPE " +this.getClass().getSimpleName())
                .append("With Color "+color.getClass().getSimpleName());
        Circle resultShape = new Circle();
        resultShape.setFillColor(color);
        this.drawShape = resultShape;
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
                .append(initialVal)
                .append("\t\t==>")
                .append("[  SHAPE NAME :\t")
                .append(this.drawShape.getClass().getSimpleName()).append(" \t SHAPE COLOR : \t")
                .append(this.drawShape.getFillColor().toString().toLowerCase())
                .append(" ] ")
                .toString();
    }
}
