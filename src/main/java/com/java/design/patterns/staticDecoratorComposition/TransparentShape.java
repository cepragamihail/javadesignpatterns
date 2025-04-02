package com.java.design.patterns.staticDecoratorComposition;

import java.util.function.Supplier;

import com.java.design.patterns.decoratorUtils.Shape;

public class TransparentShape<T extends Shape> implements Shape {
    private final Shape shape;
    private final float transparency;

    public TransparentShape(Supplier<? extends Shape> supplier, float transparency) {
        this.shape = supplier.get();
        this.transparency = transparency;
    }

    @Override
    public String info() {
        return String.format("%s has the transparency %.2f", shape.info(), transparency);
    }

}
