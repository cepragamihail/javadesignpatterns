package com.java.design.patterns.complexLibrary;

public class VideoFile {
    private String name;
    private String codecType;

    public VideoFile(String name) {
        this.name = name;
        String[] parts = name.split("\\.");
        this.codecType = parts[parts.length - 1];
    }

    public String getName() {
        return name;
    }

    public String getCodecType() {
        return codecType;
    }
}
