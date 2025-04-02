package com.java.design.patterns;

import java.io.File;

import com.java.design.patterns.facade.VideoConversionFacade;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       VideoConversionFacade videoConversionFacade = new VideoConversionFacade();
       File file = videoConversionFacade.convertVideo("youtubevideo.ogg", "mp4");
    }
}
