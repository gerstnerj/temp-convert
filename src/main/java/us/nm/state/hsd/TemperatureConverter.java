package us.nm.state.hsd;

public class TemperatureConverter {

    static final double F_TO_C = 9/5;
    
    public static double celsiusToFahrenheit(double celsius) {
	return celsius * 9 / 5 + 32;
    }
    
    public static double celsiusToKelvin(double celsius) {
	return celsius + 273.15;
    }

    public static double kelvinToFahrenheit(double kelvin) {
	return kelvin * 9 / 5 + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
	return kelvin - 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - 32) / (9 / 5);
    }

    public static double fahrenheitToKelvin(double fahrenheit) {
	return (fahrenheit - 32) / (9 / 5) + 273.15;
    }
    
}
