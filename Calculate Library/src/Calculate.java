/**
 * 
 */

/**
 * @author Donna
 *
 */
public class Calculate {
	
	public static double square(double num){
		double answer = num * num; 
		return answer; 
	}
	
	public static double average(double num, double num2){
		double answer = num + num2;
		answer = answer * 1/2;
		return answer;
	}
	
	public static double cube(double num){
		double answer = num *num * num; 
		return answer; 
	}
	
	public static double average(double num, double num2, double num3){
		double answer = num + num2 + num3;
		answer = answer * 1/3;
		return answer;
	}
	
	public static double toRadians(double angle){
		double pi = 3.14159;
		double answer = pi/180;
		answer = answer *angle;
		return answer;
	}
	
	public static double toDegrees(double rad){
		double pi = 3.14159;
		double answer = 180/pi;
		answer = answer * rad;
		return answer; 
	}
	
	public static double discriminant(double a, double b, double c){
		double bSquare  = b * b;
		double answer = 4 * a * c *bSquare;
		return answer;
	}
	
	public static String toImproperFrac(int a, int b, int c){
		int ca = c*a;
		int numerator = ca + b; 
		String div = "/";
		return numerator + div + c; 
	}
	
	public static String toMixedNum(int a, int b){
		int wholeNum = a/b;
		int aModB = a % b;
		return wholeNum + "_" + aModB + "/" + b;
	}
	
	public static String foil(int a, int b, int c, int d, String x){
		int firstCoef = a * c;
		int secondCoef = a * d;
		int thirdCoef  = b * c;
		int fourthCoef = b * d;
		int secAndThird = secondCoef + thirdCoef;
		return firstCoef + x + "^2+" + secAndThird + x + fourthCoef;
	}
	
	public static Boolean isDivisibleby(int a, int b){
		if (a % b == 0){
			return true;
		}else{
			return false;
		}
	}
	
	public static double absValue(double a){
		if (a >= 0){
			return a;
		}else{
			return a - 2*a;
		}
	}
	
	public static int max(int a, int b){
		if (a > b){
			return a;
		}else{
			return b;
		}
	}
	
	public static double max(double a, double b, double c){
		if (a > b && a > c){
			return a;
		}else if (b > c){
			return b;
		}else{
			return c;
		}
	}
	
	public static int min(int a, int b){
		if (a > b){
			return b;
		}else{
			return a;
		}
	}
	
	public static double round2(double a){
		double stepOne = a * 100.0;
		double stepTwo = stepOne + 0.5;
		stepTwo = (int) stepTwo;
		double answer = stepTwo / 100.0;
		return answer;
	}
	
	public static double exponent(double a, int b ){
		double answer = a;
		for( int i = 1; i < b; i++ ){
			answer*=a;
		}
		return answer;
	}
	
	public static int factorial(int a){
		int dog = a;
		for (int i = 0; i < a; i++){
	//		i;
		}
		return dog;
	}
}
