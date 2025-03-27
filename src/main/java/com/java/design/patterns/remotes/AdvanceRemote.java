package com.java.design.patterns.remotes;

import com.java.design.patterns.devices.Device;

public class AdvanceRemote extends BasicRemote {
    Device device; 

    public AdvanceRemote(Device device) {
        super(device);
        this.device = device;
    }
    
    public void mute() {
        System.out.println("Mute");
        device.setVolume(0);
    }

}
