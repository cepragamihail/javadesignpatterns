package com.java.design.patterns.listContainerSum;

public class SingleValue implements ValueContainer {
    private final int value;

    public SingleValue(int value) {
        this.value = value;
    }

    @Override
    public int sum() {
        return value;
    }

    @Override
    public java.util.Iterator<Integer> iterator() {
        return java.util.Collections.singleton(value).iterator();
    }

}
