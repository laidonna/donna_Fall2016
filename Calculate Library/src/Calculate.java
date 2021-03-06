/**
 * 
 */

/**
 * @author Donna Lai 9/23/16 
 * This class is a math library that contains methods that squares, averages, cubes, 
 * converts to Radians or degrees,finds the discriminant, converts from improper fractions 
 * to mixed numbers and vice versa, foils, determines if two numbers are divisible, finds 
 * the absolute values, finds the max or minimum, rounds to the tens place, finds the exponent, 
 * factorial, determines if a number is prime, finds the greatest common factor, the square root,
 * and is a quadratic formula. 
 *
 */
public class Calculate {
	
	// This method accepts two numbers(doubles)
	public static double square(double num){
		double answer = num * num; 
		return answer; 
	}
	
	// This method accepts two numbers and averages them
	public static double average(double num, double num2){
		double answer = num + num2;
		answer = answer * 1/2;
		return answer;
	}
	
	//This method accepts one double and cubes it
	public static double cube(double num){
		double answer = num *num * num; 
		return answer; 
	}
	
	//This method accepts three doubles and returns the average of the three
	public static double average(double num, double num2, double num3){
		double answer = num + num2 + num3;
		answer = answer * 1/3;
		return answer;
	}
	
	//This method accepts an angle and converts the angle to radians
	public static double toRadians(double angle){
		double pi = 3.14159;
		double answer = pi/180;
		double rad = answer *angle;
		return rad;
	}
	
	//This method accepts radians and converts it to degrees
	public static double toDegrees(double rad){
		double pi = 3.14159;
		double angle = 180/pi;
		angle = angle * rad;
		return angle; 
	}
	
	//This method accepts three doubles, a, b, and c and returns the discriminant
	public static double discriminant(double a, double b, double c){
		double bSquare  = b * b;
		double fourAC = 4*a*c;
		double answer = bSquare - fourAC;
		return answer;
	}
	
	//This method accepts three integers in mixed number form and returns an improper fraction 
	public static String toImproperFrac(int wholeNum, int numer, int denom){
		int denomAndWhole = denom*wholeNum;
		int numerator = denomAndWhole + numer; 
		String div = "/";
		return numerator + div + denom; 
	}
	
	//This method accepts two integers in improper fraction form and converts to a mixed number
	public static String toMixedNum(int numer, int denom){
		int wholeNum = numer/denom;
		int numerModDenom = numer % denom;
		return wholeNum + "_" + numerModDenom + "/" + denom;
	}
	
	//This method accepts four integers and a string (variable of choice) and returns the foil of the values 
	public static String foil(int a, int b, int c, int d, String x){
		int firstCoef = a * c;
		int secondCoef = a * d;
		int thirdCoef  = b * c;
		int fourthCoef = b * d;
		int secAndThird = secondCoef + thirdCoef;
		return firstCoef + x + "^2+" + secAndThird + x + fourthCoef;
	}
	
	// This method accepts two integers and returns a boolean to determine whether those two numbers are divisible
	public static Boolean isDivisibleby(int numerator, int denominator){
		if (denominator == 0){
			throw new IllegalArgumentException("Error! You cant have 0 as a denominator!!!! *IMPLOSION of the UNIVERSE*");
		}else if (numerator % denominator == 0){
			return true;
		}else{
			return false;
		}
	}
	
	//This method accepts a double and returns the absolute value of it 
	public static double absValue(double num){
		if (num >= 0){
			return num;
		}else{
			return num *-1;
		}
	}
	
	//This method accepts two integers and returns the larger value
	public static int max(int num1, int num2){
		if (num1 > num2){
			return num1;
		}else{
			return num2;
		}
	}
	
	//This method accepts three doubles and returns the larger value
	public static double max(double num1, double num2, double num3){
		if (num1 > num2 && num1 > num3){
			return num1;
		}else if (num2 > num3){
			return num2;
		}else{
			return num3;
		}
	}
	
	//This method accepts two integers and returns the smaller value
	public static int min(int num1, int num2){
		if (num1 > num2){
			return num2;
		}else{
			return num1;
		}
	}
	
	//This method accepts a double and returns a value rounded to the tens place
	public static double round2(double num){
		double xBy100 = num * 100.0;
		double xhalf;
		double answer;
		if (num > 0){
			xhalf = xBy100 + 0.5;
			xhalf = (int) xhalf;
			answer = xhalf / 100.0;
			return answer;
		}else{
			xhalf = xBy100 - 0.5;
			xhalf = (int) xhalf;
			answer = xhalf / 100.0;
			return answer;
		}

	}
	
	//This method accepts a double (the base number) and an integer (the power) and returns the exponent value
	public static double exponent(double base, int power ){
		double answer = base;
		if (power <= 0){
			throw new IllegalArgumentException("Error! You can't have a power that is less than 0. "
					+ "(Technically you could but I can't do it.:P)");
		}
		for( int i = 1; i < power; i++ ){
			answer*=base;
		}
		return answer;
	}
	
	//This method accepts an integer and returns the factorial of the integer
	public static int factorial(int a){
		int factorial = 1;
		if (factorial <= 0 ){
			throw new IllegalArgumentException("Error! You can't use factorial for a negative number!");
		}
		for (int i = 1; i <= a; i--){
			factorial *= i;
		}
		return factorial;
	}
	
	//This method accepts an integer and determines whether the integer is prime or not and returns a boolean 
	public static Boolean isPrime(int num){
		for (int i = 2; i < num; i++){
			if (Calculate.isDivisibleby(num, i) == true){
				return false;
			}
		}
		return true;
	}
	
	//This method accepts two integers and returns the greatest common factor of the two integers
	public static int gcf(int num1, int num2){
		while (num1 != 0 && num2 != 0){
			int gcf = num2;
			num2 = num1 % num2;
			num1 = gcf;
		}
		int gcf = num1 + num2;
		return gcf;
	}
	
	//This method accepts a double and returns the square root of that number.
	public static double sqrt(double num){
		double squareRoot =  round2(Math.sqrt(num)); 
		if ( num < 0){
			throw new IllegalArgumentException("Error! You can't square root a negative number!");
		}else{
			return squareRoot;
		}
	}
	
	// This method accepts three integers, a, b, and c and returns the value(s) of x of the quadratic formula
	public static String quadForm(int a, int b, int c){
		String answer;
		double x1; 
		double x2;
		int negB = b *-1;
		int twoA = 2*a;
		double discriminant = Calculate.discriminant(a, b, c);
		
		if (discriminant >= 0){
			x1 = negB + Calculate.sqrt(discriminant);
			x1 = x1/twoA;
		
			x2 = negB - (Calculate.sqrt(discriminant));
			x2 = x2/twoA;
		
			double max = Calculate.max(x1, x2, -100000.0);
			double min = Calculate.min(x1, x2);

			answer = Calculate.round2(max) + " "+ Calculate.round2(min);
			return answer;
		}else{
			return "no real roots";
		}
	}

// This is the min method that accepts doubles and returns a double used specifically for quadForm. 	
	public static double min(double num1, double num2){
		if (num1 > num2){
			return num2;
		}else{
			return num1;
		}
	}
}
