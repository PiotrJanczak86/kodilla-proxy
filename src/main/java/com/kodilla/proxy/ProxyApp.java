package com.kodilla.proxy;

import com.kodilla.proxy.db.WeatherForecastProxy;

import java.util.Random;

public class ProxyApp {

    public static void main(String[] args) throws InterruptedException {

        WeatherForecastProxy weatherForecastProxy = new WeatherForecastProxy();

        long begin = System.currentTimeMillis();

        for (int n = 0; n < 5; n++) {
            int number = new Random().nextInt(100);
            if (number < 20) weatherForecastProxy.getWeatherForecast().refreshData();
            System.out.println(weatherForecastProxy.getWeatherForecast().getWeather());
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }
}