

/* @author Donna Lai 
   August 30, 2016
   Temperature Convert -- This program converts Fahrenheit to Celsius. 
*/

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		double fahrenheit = 32;
		double minus32;
		double celsius;
		minus32 = fahrenheit - 32;
		celsius = minus32 * 5/9;
		System.out.println(celsius);
	}

}
