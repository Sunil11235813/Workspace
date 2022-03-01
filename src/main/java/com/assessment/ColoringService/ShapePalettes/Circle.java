package com.assessment.ColoringService.ShapePalettes;

import com.assessment.ColoringService.ColorPalettes.*;

import java.util.UUID;

public class Circle extends Shape{
    private static StringBuilder initialVal ;
    private Shape drawShape;

    public Circle(){}
    public Circle(YellowColor color){
        initialVal = new StringBuilder()
                .append("Initial SHAPE " +this.getClass().getSimpleName())
                .append("With Color "+color.getClass().getSimpleName());
        Triangle resultShape = new Triangle();
        resultShape.setFillColor(color);
        this.drawShape = resultShape;
    }
    public Circle(Color color){
        initialVal = new StringBuilder()
                .append("Initial SHAPE " +this.getClass().getSimpleName())
                .append("With Color "+color.getClass().getSimpleName());
        var temp = new YellowColor();
        temp.setColorValue("YELLOW");
        color = temp;
        Square resultShape = new Square();
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
