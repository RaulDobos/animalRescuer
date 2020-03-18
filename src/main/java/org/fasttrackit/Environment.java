package org.fasttrackit;

public class Environment {

    private String weather;
    private int temperature;

    public Environment(String passedWeatherParameter, int passedTemperatureParameter){
        weather = passedWeatherParameter;
        temperature = passedTemperatureParameter;

        System.out.println("(constructor called)");
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
