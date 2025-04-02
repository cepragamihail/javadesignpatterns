package com.java.design.patterns.dynamicDecoratorComposition;

public class Square implements Shape {

    private float side;

    public Square(){};

    public Square(float side) {
        this.side = side;
    }

    void resize(float factor) {
        this.side *= factor;
    }
    @Override
    public String info() {
        return "A square with side " + side;
    }

}
