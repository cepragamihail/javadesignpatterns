package com.java.design.patterns.DeliveryService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompositeBox implements Box{
    private final List<Box> boxes = new ArrayList<>();   

    public CompositeBox(Box...boxes){   
        this.boxes.addAll(Arrays.asList(boxes));
    }   
    @Override
    public double calculatePrice(){   
        return boxes.stream()
                .mapToDouble(Box::calculatePrice)
                .sum();   
    }

}