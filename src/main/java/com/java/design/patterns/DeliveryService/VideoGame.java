package com.java.design.patterns.DeliveryService;

public class VideoGame extends Product {
    private final String platform;

    public VideoGame(String title, double price, String platform) {
        super(title, price);
        this.platform = platform;
    }

    @Override
    public double calculatePrice() {
        return getPrice();
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "platform='" + platform + '\'' +
                ", name='" + getTitle() + '\'' +
                ", price=" + getPrice() +
                '}';
    }

}
 