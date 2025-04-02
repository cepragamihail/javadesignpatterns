package com.java.design.patterns.dynamicDecoratorComposition;

public class ColoredShape implements Shape {

    private Shape shape;
    private String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return String.format("%s has the color %s", shape.info(), color);
    }

    public void resize(float factor) {
        if (shape instanceof Circle) {
            ((Circle) shape).resize(factor);
        } else if (shape instanceof Square) {
            ((Square) shape).resize(factor);
        }
    }

}
