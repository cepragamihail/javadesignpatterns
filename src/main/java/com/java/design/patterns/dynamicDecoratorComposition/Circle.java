package com.java.design.patterns.dynamicDecoratorComposition;

public class Circle implements Shape {

    private float radius;

    public Circle(){};

    public Circle(float radius) {
        this.radius = radius;
    }

    void resize(float factor) {
        this.radius *= factor;
    }
    @Override
    public String info() {
        return "A circle with radius " + radius;
    }

}
