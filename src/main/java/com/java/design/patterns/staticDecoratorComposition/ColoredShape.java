package com.java.design.patterns.staticDecoratorComposition;

import java.util.function.Supplier;

import com.java.design.patterns.decoratorUtils.Shape;

public class ColoredShape<T extends Shape> implements Shape {
    private final Shape shape;
    private final String color;

    public ColoredShape(Supplier<? extends Shape> supplier, String color) {
        this.shape = supplier.get();
        this.color = color;
    }
    @Override
    public String info() {
        return String.format("%s has the color %s", shape.info(), color);
    }


}
