package com.assessment.ColoringService.ShapePalettes;

import com.assessment.ColoringService.ColorPalettes.Color;

abstract class Shape implements ShapeDraw{
    private Color fillColor;
    abstract public Shape draw();

    public Color getFillColor() {
        return fillColor;
    }

    public void setFillColor(Color fillColor) {
        this.fillColor = fillColor;
    }
}

