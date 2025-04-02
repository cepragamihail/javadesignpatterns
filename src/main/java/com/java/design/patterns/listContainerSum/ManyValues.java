package com.java.design.patterns.listContainerSum;

import java.util.ArrayList;

public class ManyValues extends ArrayList<Integer> implements ValueContainer {
    @Override
    public int sum() {
        int total = 0;
        for (int value : this) {
            total += value;
        }
        return total;
    }

}
