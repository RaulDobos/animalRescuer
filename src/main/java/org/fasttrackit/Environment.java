package org.fasttrackit;

public class Environment {

    String weather;
    int temperature;

    public Environment(String passedWeatherParameter, int passedTemperatureParameter){
        weather = passedWeatherParameter;
        temperature = passedTemperatureParameter;

        System.out.println("(constructor called)");
    }

}
