package com.java.design.patterns;

import com.java.design.patterns.dynamicDecoratorComposition.Circle;
import com.java.design.patterns.dynamicDecoratorComposition.ColoredShape;
import com.java.design.patterns.dynamicDecoratorComposition.Square;
import com.java.design.patterns.dynamicDecoratorComposition.TransparentShape;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Decorator Pattern with Dynamic Composition");
        implementsDynamicDecoratorComposition();
    }

    public static void implementsDynamicDecoratorComposition() {
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
