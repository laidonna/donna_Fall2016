/**
 * 
 */

/**
 * @author Donna
 *
 */
public class Calculate {
	
	public static double square(double number){
		double answer = number *number; 
		return answer; 
	}
	
	public static double average(double number, double num2){
		double answer = number + num2;
		answer = answer * 1/2;
		return answer;
	}
	
	public static double cube(double number){
		double answer = number *number * number; 
		return answer; 
	}
	public static double average3(double number, double num2, double num3){
		double answer = number + num2 + num3;
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
	
//	public static double discriminant(double )
}
