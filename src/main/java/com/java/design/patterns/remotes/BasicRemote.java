package com.java.design.patterns.remotes;

import com.java.design.patterns.devices.Device;

public class BasicRemote implements Remote {
    private Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
	public void power(){		
        System.out.println("Remote: Power toggle");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: Volume down");
        device.setVolume(device.getVolume() - 10);
    }
    @Override
    public void volumeUp() {
        System.out.println("Remote: Volume up");
        device.setVolume(device.getVolume() + 10);
    }
    @Override
    public void channelDown() {
        System.out.println("Remote: Channel down");
        device.setChannel(device.getChannel() - 1);
    }
    @Override
    public void channelUp() {
        System.out.println("Remote: Channel up");
        device.setChannel(device.getChannel() + 1);
    }

}
