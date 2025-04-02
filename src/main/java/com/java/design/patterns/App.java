package com.java.design.patterns;

import com.java.design.patterns.DeliveryService.Book;
import com.java.design.patterns.DeliveryService.CompositeBox;
import com.java.design.patterns.DeliveryService.DeliveryService;
import com.java.design.patterns.DeliveryService.VideoGame;
import com.java.design.patterns.neuralNetworks.Neuron;
import com.java.design.patterns.neuralNetworks.NeuronLayer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        // Uncomment the line below to run the composite pattern example
        System.out.println("Composite Pattern Example:");
        compositePatternExample();
        System.out.println("Composite Pattern Example of Neural Network:");
        compositePatternExampleOfNeuralNetwork();
    }

    public static void compositePatternExample() {     
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
            new CompositeBox(
                new VideoGame("Game1", 10.0, "Platform"), 
                new VideoGame("Game2", 20.0, "Platform")),
            new CompositeBox(
                new VideoGame("Game3", 30.0, "Platform"), 
                new VideoGame("Game4", 40.0, "Platform")),
            new CompositeBox(
                new CompositeBox(
                    new Book("Book1", 50.0, "Author"), 
                    new Book("Book4", 80.0, "Author")),
                    new VideoGame("Game5", 15.0, "Genre"),
                    new VideoGame("Game6", 25.0, "Genre")
            )

        );
        double totalPrice = deliveryService.calculateTotalCost();
        System.out.println("Total price: " + totalPrice);
    } 

    public static void compositePatternExampleOfNeuralNetwork() { 
        // Create a neuron
        Neuron neuron1 = new Neuron();
        Neuron neuron2 = new Neuron();
        // Create a neuron layer
        NeuronLayer layer1 = new NeuronLayer();
        // Create another neuron layer
        NeuronLayer layer2 = new NeuronLayer();

        // Connect the layers
        neuron1.connectTo(neuron2);
        neuron1.connectTo(layer1);
        layer1.connectTo(neuron1);
        layer1.connectTo(layer2);


        // Iterate through the neurons in the first layer
        for (Neuron neuron : layer1) {
            System.out.println(neuron);
        }

    }
}
