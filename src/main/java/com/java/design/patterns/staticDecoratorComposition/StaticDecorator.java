package com.java.design.patterns.staticDecoratorComposition;

import com.java.design.patterns.decoratorUtils.Circle;
import com.java.design.patterns.decoratorUtils.Square;

public class StaticDecorator {


    public static void implementsStaticDecorator() {
        // Create a colored and transparent circle
        ColoredShape<Circle> coloredCircle = new ColoredShape<>(() -> new Circle(5), "red");
        TransparentShape<ColoredShape<Circle>> transparentColoredCircle = new TransparentShape<>(() -> coloredCircle, 0.5f);
        System.out.println(transparentColoredCircle.info());

        // Create a colored and transparent square
        ColoredShape<Square> coloredSquare = new ColoredShape<>(() -> new Square(10), "blue");
        TransparentShape<ColoredShape<Square>> transparentColoredSquare = new TransparentShape<>(() -> coloredSquare, 0.8f);
        System.out.println(transparentColoredSquare.info());
    }

}
