package com.java.design.patterns.adapter;

import com.java.design.patterns.client.IMultiRestApp;
import com.java.design.patterns.service.FancyUIService;

public class FancyUIServiceAdapter implements IMultiRestApp {
    private  final FancyUIService fancyUIService;

    public FancyUIServiceAdapter(FancyUIService fancyUIService) {
        this.fancyUIService = fancyUIService;
    }

    @Override
    public void displayMenu(Object xmlData) {
        Object jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayMenu(jsonData);
    }

    @Override
    public void displayRecommendations(Object xmlData) {
        Object jsonData = convertXmlToJson(xmlData);
        fancyUIService.displayRecommendations(jsonData);
    }

    private Object convertXmlToJson(Object xmlData) {
        System.out.println("Converting XML data to JSON");
        return new Object(); 
    }

}
