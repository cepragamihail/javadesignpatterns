package com.java.design.patterns;

import com.java.design.patterns.adapter.FancyUIServiceAdapter;
import com.java.design.patterns.client.IMultiRestApp;
import com.java.design.patterns.client.MultiRestoApp;
import com.java.design.patterns.service.FancyUIService;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Adapter Design Pattern Implementation");
        useAdapaterPattern();
    }

    public static void useAdapaterPattern() {
        Object xmlData = new Object();
        IMultiRestApp multiRestoApp = new MultiRestoApp();
        multiRestoApp.displayMenu(xmlData);
        multiRestoApp.displayRecommendations(xmlData);
        
        FancyUIService fancyUIService = new FancyUIService();
        FancyUIServiceAdapter fancyUIServiceAdapter = new FancyUIServiceAdapter(fancyUIService);
        fancyUIServiceAdapter.displayMenu(xmlData);
        fancyUIServiceAdapter.displayRecommendations(xmlData);
    }
}
