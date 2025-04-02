package com.java.design.patterns.facade;

import java.io.File;

import com.java.design.patterns.complexLibrary.AudioMixer;
import com.java.design.patterns.complexLibrary.BitrateReader;
import com.java.design.patterns.complexLibrary.Codec;
import com.java.design.patterns.complexLibrary.CodecFactory;
import com.java.design.patterns.complexLibrary.MPEF4CompressionCodec;
import com.java.design.patterns.complexLibrary.OggCompressionCodec;
import com.java.design.patterns.complexLibrary.VideoFile;

public class VideoConversionFacade {
    public File convertVideo(String fileName, String format) {
        System.out.println("VideoConversionFacade: conversion started.");
        System.out.println("VideoConversionFacade: converting file " + fileName + " to format " + format);

        // Simulate the conversion process
        VideoFile file = new VideoFile(fileName);
        Codec sourceCodec = CodecFactory.extract(file);
        Codec destinationCodec;
        if (format.equals("mp4")) {
            destinationCodec = new MPEF4CompressionCodec();
        } else if (format.equals("ogg")) {
            destinationCodec = new OggCompressionCodec();
        } else {
            throw new UnsupportedOperationException("Unsupported format: " + format);
        }
        VideoFile buffer = BitrateReader.read(file, sourceCodec.getType());
        VideoFile result = BitrateReader.convert(buffer, destinationCodec.getType());
        File resultFile = (new AudioMixer()).fix(result);
        System.out.println("VideoConversionFacade: conversion completed.");
        return resultFile;
    }

}
