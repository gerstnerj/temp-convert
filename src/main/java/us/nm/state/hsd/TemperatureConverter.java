package us.nm.state.hsd;

/**
 * Joshua Gestner
 * @author gerstnerj
 *
 */

public class TemperatureConverter {

    static final double F_TO_C = 1.8;
    static final double ABS_ZERO = 273.15;
    static final int ZERO = 32;
    
    public static double celsiusToFahrenheit(double celsius) {
	return (celsius * F_TO_C) + ZERO;
    }
    
    public static double celsiusToKelvin(double celsius) {
	return celsius + ABS_ZERO;
    }

    public static double kelvinToFahrenheit(double kelvin) {
	return (celsiusToFahrenheit(kelvinToCelsius(kelvin)));
//	return (kelvin - ABS_ZERO) * F_TO_C + ZERO;
    }

    public static double kelvinToCelsius(double kelvin) {
	return kelvin - ABS_ZERO;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - ZERO) / F_TO_C;
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
	return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
//	return (fahrenheit - ZERO) / F_TO_C + ABS_ZERO;
    }
    
}
