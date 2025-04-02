package com.java.design.patterns.listContainerSum;

import java.util.ArrayList;
import java.util.Collection;

public class MyList extends ArrayList<ValueContainer> {

    public MyList(Collection<? extends ValueContainer> c) {
        super(c);
    }

    public int sum() {
       return stream().mapToInt(ValueContainer::sum).sum();   
    }
}