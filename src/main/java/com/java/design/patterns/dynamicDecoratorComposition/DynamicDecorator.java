package com.java.design.patterns.dynamicDecoratorComposition;

import com.java.design.patterns.decoratorUtils.Circle;
import com.java.design.patterns.decoratorUtils.Square;

public class DynamicDecorator {

    public static void implementsDynamicDecorator() {
        // Create a circle and a square
        Circle circle = new Circle(5);
        System.out.println(circle.info());
        Square square = new Square(4);
        System.out.println(square.info());

        // Decorate the circle with color and transparency
        ColoredShape coloredCircle = new ColoredShape(circle, "red");
        TransparentShape transparentCircle = new TransparentShape(coloredCircle, 50);

        // Decorate the square with color and transparency
        ColoredShape coloredSquare = new ColoredShape(square, "blue");
        TransparentShape transparentSquare = new TransparentShape(coloredSquare, 75);

        // Print the information about the shapes
        System.out.println(transparentCircle.info());
        System.out.println(transparentSquare.info());
    }

}
