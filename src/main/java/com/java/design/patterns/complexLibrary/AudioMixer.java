package com.java.design.patterns.complexLibrary;

import java.io.File;

public class AudioMixer {
    public File fix(VideoFile videoFile) {
        String result = "AudioMixer: fixing audio.";
        System.out.println(result);
        return new File("tmp");
    }
}
