/**
 * 
 */

/**
 * @author Donna Lai 9/22/16
 * This class is to call the methods from the calculate library.
 *
 */
public class DoMath {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		double square = Calculate.square(5.0); 
		System.out.println(square);
		
		double average = Calculate.average(5.0, 10.0);
		System.out.println(average);
		
		double cube = Calculate.cube(7.0);
		System.out.println(cube);
		
		double average3 = Calculate.average(5.0, 6.0, 7.0);
		System.out.println(average3);
		
		double toDegrees = Calculate.toRadians(180);
		System.out.println(toDegrees);
		
		double toRadians = Calculate.toDegrees(4);
		System.out.println(toRadians);
		
		double discriminant = Calculate.discriminant(1, 2, 3);
		System.out.println(discriminant);
		
		String toImproperFrac = Calculate.toImproperFrac(3, 1, 2);
		System.out.println(toImproperFrac);
		
		String toMixedNum = Calculate.toMixedNum(6,2);
		System.out.println(toMixedNum);
		
		String foil = Calculate.foil(2, 3, 6, -7, "n");
		System.out.println(foil);
		
		Boolean isDivisibleby = Calculate.isDivisibleby(1, 2);
		System.out.println(isDivisibleby);
		
		double absValue = Calculate.absValue(100);
		System.out.println(absValue);
		
		double max = Calculate.max(-1, -2);
		System.out.println(max);
		
		double max3 = Calculate.max(45, 456, 12);
		System.out.println(max3);
		
		int min = Calculate.min(99, 98);
		System.out.println(min);
		
		double round2 = Calculate.round2(-3);
		System.out.println(round2);
		
		double exponent = Calculate.exponent(-5,4);
		System.out.println(exponent);
		
		int factorial = Calculate.factorial(-6);
		System.out.println(factorial);
		
		Boolean isPrime = Calculate.isPrime(25);
		System.out.println(isPrime);
		
		int gcf = Calculate.gcf(4, 12);
		System.out.println(gcf);
		
		double sqrt = Calculate.sqrt(16);
		System.out.println(sqrt);
		
		String quadForm = Calculate.quadForm(13, 19, -14);
		System.out.println(quadForm);
	}
	

}
