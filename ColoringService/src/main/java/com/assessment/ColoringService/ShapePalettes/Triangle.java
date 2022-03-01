package com.assessment.ColoringService.ShapePalettes;

import com.assessment.ColoringService.ColorPalettes.*;

import java.util.UUID;

public class Triangle extends Shape{
    private static StringBuilder initialVal ;
    private Shape drawShape;

    public Triangle(){}
    public Triangle(YellowColor color){
        initialVal = new StringBuilder()
                .append("Initial SHAPE " +this.getClass().getSimpleName())
                .append("With Color "+color.getClass().getSimpleName());
        Line resultShape = new Line();
        resultShape.setFillColor(color);
        this.drawShape = resultShape;
    }
    public Triangle(Color color){
        initialVal = new StringBuilder()
                .append("Initial SHAPE " +this.getClass().getSimpleName())
                .append("With Color "+color.getClass().getSimpleName());
        var temp = new YellowColor();
        temp.setColorValue("YELLOW");
        color = temp;
        Rectangle resultShape = new Rectangle();
        resultShape.setFillColor(color);
        this.drawShape = resultShape;
    }
    @Override
    public Shape draw() {
        return this.drawShape;
    }

    @Override
    public int hashCode() {
        return 31*UUID.randomUUID().hashCode();
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
