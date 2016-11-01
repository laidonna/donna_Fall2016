// Donna Lai
// 10/30/16
// APCS String Split
// This program will split a string at the string "bread" and will return what is in between the bread. 
import java.util.*;

public class Split{

	public static void main(String[] args){
		sandwichCutter("applespineapplesbreadlettustomatobaconmayohambreadcheese");
		sandwichCutter("applesbreadapples");
		sandwichCutter("applespineapplesbreadlettustomatobaconmayohambread");
		sandwichCutter("applespineapplesbreadbreadlettustomatobaconmayohamcheese");
		sandwichCutter("breadlettustomatobaconmayohambreadcheeseaplles");
		
		spaceSandwich("1apples pineapples bread lettus tomato bacon mayo ham bread cheese");
		spaceSandwich("apples bread apples");
		spaceSandwich("apples pineapples bread lettus tomato bacon mayo ham bread");
		spaceSandwich("apples pineapples bread bread lettus tomato bacon mayo ham cheese");
		spaceSandwich("bread lettus tomato bacon mayo ham bread cheese aplles");
	}
	 //This method finds all of the edge tests and possibilities sandwiches can be constructed and returns corresponding values
	public static void sandwichCutter(String sandwich){
 		String[] sandwichInside = sandwich.split("bread");
 		String breadAndAfter = sandwich.substring(sandwich.indexOf("bread")+5);
 		
 		if (sandwich.indexOf("bread") < 0){
 			System.out.println("Sandwich not found!");
 		} else if (breadAndAfter.indexOf("bread") < 0){
 			System.out.println("Sandwich not found!!");
 		}
 		
 		if(sandwich.indexOf("bread") > 0){
 			for (int i = 1; i < sandwichInside.length-1; i++){
 				System.out.println(sandwichInside[i]);
 			}
 		} else if ((sandwich.indexOf("bread")) > 0 && (breadAndAfter.equals(""))){
 			for (int i = 1; i < sandwichInside.length; i++){
 				System.out.println(sandwichInside[i]);
 			}
 		} else if (breadAndAfter.equals("")){
 			for (int i = 0; i < sandwichInside.length; i++){
 				System.out.println(sandwichInside[i]);
 			}
 		} else {
 			for(int i = 0; i < sandwichInside.length - 1; i++){
 				System.out.println(sandwichInside[i]);
 			}
 		}
 		System.out.println(Arrays.toString(sandwichInside));
	}
	
	//This method does the same as sandwichCutter but can accomodate for input with spaces
	public static void spaceSandwich (String sandwich){
		String [] noSpaces = sandwich.split("  ");
		sandwichCutter(Arrays.toString(noSpaces));
	}
	

	
	
	
	
	
	
}




