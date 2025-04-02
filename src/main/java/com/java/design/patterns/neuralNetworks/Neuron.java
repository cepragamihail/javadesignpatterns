package com.java.design.patterns.neuralNetworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Neuron implements SomeNeurons {

    public ArrayList<Neuron> in,out;

    @Override
    public Iterator<Neuron> iterator() {
        return Collections.singleton(this).iterator(); 
    }

    @Override
    public Spliterator<Neuron> spliterator() {
        return Collections.singleton(this).spliterator(); 
    }

    @Override
    public void forEach(Consumer<? super Neuron> action) {
        action.accept(this); 
    }


}
