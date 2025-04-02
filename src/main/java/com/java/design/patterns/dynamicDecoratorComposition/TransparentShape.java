package com.java.design.patterns.dynamicDecoratorComposition;

public class TransparentShape implements Shape {

    private Shape shape;
    private int transparency;

    public TransparentShape(Shape shape, int transparency) {
        this.shape = shape;
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return String.format("%s has a transparency of %d", shape.info(), transparency);
    }

    public void resize(float factor) {
        if (shape instanceof Circle) {
            ((Circle) shape).resize(factor);
        } else if (shape instanceof Square) {
            ((Square) shape).resize(factor);
        }
    }
    public float getTransparency() {
        return transparency;
    }

}
