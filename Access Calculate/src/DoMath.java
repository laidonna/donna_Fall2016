/**
 * 
 */

/**
 * @author Donna
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
		
		double average3 = Calculate.average3(5.0, 6.0, 7.0);
		System.out.println(average3);
	}
	

}
