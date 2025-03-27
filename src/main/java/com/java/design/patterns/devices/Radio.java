package com.java.design.patterns.devices;

public class Radio implements Device {   
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if (percent > 100) {
            this.volume = 100;
        } else if (percent < 0) {
            this.volume = 0;
        } else {
            this.volume = percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
        System.out.println("Radio is " + (on ? "enabled" : "disabled") + ", volume: " + volume + "%, channel: " + channel);
    }

}
