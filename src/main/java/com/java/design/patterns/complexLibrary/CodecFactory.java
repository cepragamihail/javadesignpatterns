package com.java.design.patterns.complexLibrary;

public class CodecFactory {
    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals("mp4")) {
            // Simulate a complex codec extraction process
            System.out.println("CodecFactory: extracting mp4 codec...");
            return new MPEF4CompressionCodec();
        } else if (type.equals("ogg")) {
            // Simulate a complex codec extraction process
            System.out.println("CodecFactory: extracting ogg codec...");
            return new OggCompressionCodec();
        } else {
            throw new UnsupportedOperationException("Unsupported codec: " + type);
        }
    }

}
