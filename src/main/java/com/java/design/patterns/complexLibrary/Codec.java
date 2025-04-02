package com.java.design.patterns.complexLibrary;

public interface Codec {

    String type = null;

    default String getType() {
        return type;
    }
}
