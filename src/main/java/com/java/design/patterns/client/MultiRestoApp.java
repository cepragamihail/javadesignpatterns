package com.java.design.patterns.client;

public class MultiRestoApp  implements IMultiRestApp {
    @Override
	public void displayMenu(Object xmlData) {
        System.out.println("Displaying menu for MultiRestoApp using XML data");
    }		
    @Override
    public void displayRecommendations(Object xmlData) {
        System.out.println("Displaying recommendations for MultiRestoApp using XML data");
    }

}
