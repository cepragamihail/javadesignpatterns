package com.java.design.patterns.complexLibrary;

public class BitrateReader {
    public static VideoFile read(VideoFile file, String format) {
        System.out.printf("Reading file: %s with format: %s%n", file.getName(), format);
        return file;
    }

    public static VideoFile convert(VideoFile file, String format) {
        System.out.printf("Converting file: %s to format: %s%n", file.getName(), format);
        return file;
    }

}
