package com.java.design.patterns;

import com.java.design.patterns.dynamicDecoratorComposition.DynamicDecorator;
import com.java.design.patterns.staticDecoratorComposition.StaticDecorator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Decorator Pattern with Dynamic Composition");
        DynamicDecorator.implementsDynamicDecorator();

        System.out.println("Decorator Pattern with Static Composition");
        StaticDecorator.implementsStaticDecorator();
    }

    
}
