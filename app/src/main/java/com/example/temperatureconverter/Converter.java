package com.example.temperatureconverter;

/**
 * Created by leifb on 08.06.16.
 */
public class Converter {

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5./9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9./5 + 32;
    }
}
