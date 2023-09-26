package com.kodilla.proxy.db;

public class WeatherForecastProxy {
    private WeatherForecast weatherForecast;

    public WeatherForecast getWeatherForecast() throws InterruptedException {
        if(weatherForecast == null) weatherForecast = new WeatherForecast();
        return weatherForecast;
    }
}