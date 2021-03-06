import java.io.*;
import java.util.Scanner;

public class TempFileDiff {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner console = new Scanner(new File("src/weather.txt"));		
		double change;
		double first, next;
		first = console.nextDouble();
		next = first;
		while (console.hasNextDouble()){ 
			first = console.nextDouble(); 
			change = first - next;
			System.out.println(next + " to " + first + ", change = " + round2(change));
			next = first;
		}
	}
	
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
}


