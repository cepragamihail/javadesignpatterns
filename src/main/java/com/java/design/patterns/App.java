package com.java.design.patterns;

import com.java.design.patterns.devices.Device;
import com.java.design.patterns.devices.Radio;
import com.java.design.patterns.devices.Tv;
import com.java.design.patterns.remotes.AdvanceRemote;
import com.java.design.patterns.remotes.BasicRemote;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Example of Bridge Design Pattern Example");
        System.out.println( "----------------------------------------");
        useBridgeDesignPatternImplementation();
        System.out.println( "----------------------------------------");
    }

    private static void useBridgeDesignPatternImplementation() {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device){
        System.out.println("Test with BasicRemote remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power(); 
        basicRemote.volumeUp();
        basicRemote.channelUp();
        basicRemote.volumeDown();
        device.printStatus();

        System.out.println("Test with AdvanceRemote remote");
        AdvanceRemote advanceRemote = new AdvanceRemote(device);
        advanceRemote.power();
        advanceRemote.volumeUp();        
        advanceRemote.mute();
        device.printStatus();
    }; 
}
