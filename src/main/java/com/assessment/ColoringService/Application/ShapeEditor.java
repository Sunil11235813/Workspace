package com.assessment.ColoringService.Application;

import com.assessment.ColoringService.ColorPalettes.*;
import com.assessment.ColoringService.ShapePalettes.*;

public class ShapeEditor {
    /*
    Please implement an application or service that allows for dragging a color on a shape as follows:

    Yellow dropped on Square ⇒ turns the shape into a Yellow rectangle
    Yellow on Circle ⇒ Yellow Triangle
    Yellow on Triangle ⇒ Yellow Line
    Yellow on Line ⇒ Yellow Circle

    Red dropped on Square ⇒ turns the shape into a Circle
    Red on Circle ⇒ Yellow Square
    Red on Triangle ⇒ Yellow Rectangle
    Red on Line ⇒ Yellow Square

     */
    public static void main(String... args){

        var yellowSelectedColor = new YellowColor();
        yellowSelectedColor.setColorValue("YELLOW");

        ShapeDraw focusShape = new Square(yellowSelectedColor);
        System.out.println(focusShape.toString());

        focusShape = new Circle(yellowSelectedColor);
        System.out.println(focusShape.toString());

        focusShape = new Triangle(yellowSelectedColor);
        System.out.println(focusShape.toString());

        focusShape = new Line(yellowSelectedColor);
        System.out.println(focusShape.toString());

        var redSelectedColor = new RedColor();
        redSelectedColor.setColorValue("RED");

        focusShape = new Square(redSelectedColor);
        System.out.println(focusShape.toString());

        focusShape = new Circle(redSelectedColor);
        System.out.println(focusShape.toString());

        focusShape = new Triangle(redSelectedColor);
        System.out.println(focusShape.toString());

        focusShape = new Line(redSelectedColor);
        System.out.println(focusShape.toString());
    }
}
