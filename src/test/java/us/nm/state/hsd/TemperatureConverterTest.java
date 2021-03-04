package us.nm.state.hsd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class TemperatureConverterTest {

//    static final double[] celsiusTemps = { 100, -40, 0 };
//    static final double[] fahrenheitTemps = { 212, -40, 32 };

    static final double FAHRENHEIT_TOLERANCE = 0.001;
    static final double CELSIUS_KELVIN_TOLERANCE = 0.0005556;
    
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToFahrenheit(double celsius, double fahrenheit) {
	assertEquals(
		fahrenheit, 
		TemperatureConverter.celsiusToFahrenheit(celsius),
		FAHRENHEIT_TOLERANCE
	);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void celsiusToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(
		kelvin, 
		TemperatureConverter.celsiusToKelvin(celsius),
		CELSIUS_KELVIN_TOLERANCE
	);	
    }
    
    //TODO Complete new test methods, change assert parameters
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void kelvinToFahrenheit(double celsius, double fahrenheit, double kelvin) {
	assertEquals(
		fahrenheit, 
		TemperatureConverter.kelvinToFahrenheit(kelvin),
		CELSIUS_KELVIN_TOLERANCE
	);	
    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void kelvinToCelsius(double celsius, double fahrenheit, double kelvin) {
	assertEquals(
		celsius, 
		TemperatureConverter.kelvinToCelsius(kelvin),
		CELSIUS_KELVIN_TOLERANCE
	);	
    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void fahrenheitToCelsius(double celsius, double fahrenheit) {
	assertEquals(
		celsius, 
		TemperatureConverter.fahrenheitToCelsius(fahrenheit),
		CELSIUS_KELVIN_TOLERANCE
	);	
    }
    
    @ParameterizedTest
    @CsvFileSource(resources = "temperatures.csv", numLinesToSkip = 1)
    void fahrenheitToKelvin(double celsius, double fahrenheit, double kelvin) {
	assertEquals(
		kelvin, 
		TemperatureConverter.fahrenheitToKelvin(fahrenheit),
		CELSIUS_KELVIN_TOLERANCE
	);	
    }
    
    
    
/*  For test @MethodSource("temperatures")
 * 
 */
//    static Double[][] temperatures() {
//	return new Double[][] { 
//	    {100d, 212d}, 
//	    {-40d, -40d}, 
//	    {  0d,  32d} 
//	};
//
//    }

}
