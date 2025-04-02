package com.java.design.patterns.decoratorUtils;

public class Square implements Shape {

    private float side;

    public Square(){};

    public Square(float side) {
        this.side = side;
    }

    public void resize(float factor) {
        this.side *= factor;
    }
    @Override
    public String info() {
        return "A square with side " + side;
    }

}
