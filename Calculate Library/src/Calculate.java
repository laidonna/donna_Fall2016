/**
 * 
 */

/**
 * @author Donna
 *
 */
public class Calculate {
	
	public static double square(double num){
		double answer = num *num; 
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
	
	public static double average3(double num, double num2, double num3){
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
		double bSquare  = b *b;
		double answer = 4 * a *c *bSquare;
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
}
