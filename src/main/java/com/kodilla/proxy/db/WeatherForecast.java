package com.kodilla.proxy.db;

import java.util.Random;

public class WeatherForecast {

    public WeatherForecast() throws InterruptedException {
        refreshData();
    }

    private String weather = "windy";
    public String getWeather(){
        return "It's " + weather + " today";
    }

    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
        Random random = new Random();
        int n = random.nextInt(3);
        if(n==0)weather = "windy";
        if(n==1)weather = "sunny";
        if(n==2)weather = "rainy";
        System.out.println("The forecast was updated");
    }
}