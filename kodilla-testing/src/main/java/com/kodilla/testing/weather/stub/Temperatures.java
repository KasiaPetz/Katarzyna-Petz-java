package com.kodilla.testing.weather.stub;

import java.util.HashMap;

public interface Temperatures {

    // first element of map is an idetifier of weather station
    // second element of map is a temperature in Celsius degrees

    HashMap<Integer, Double> getTemperatures();
}



