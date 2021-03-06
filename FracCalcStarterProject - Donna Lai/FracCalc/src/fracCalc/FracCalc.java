/* 
 * Donna Lai
 * 12/6/16
 * 1st period APCS
 * 
 */
package fracCalc;
import java.util.Scanner;

public class FracCalc {

	//The main method sets up a scanner for input and keeps asking for equations until user quits. Also calls produce answer
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please input the equation you want answered.");
    	String equation = input.nextLine();
    	while(!equation.equals("quit")){
    		System.out.println(produceAnswer(equation));
    		System.out.println("Please input the equation you want answered.");
    		equation = input.nextLine();
    	}
    }
    //Produce answer method splits the operand and operator then calls to parse and trim them. 
    //Then, sets two arrays to change into improper fractions, and common denominator fractions 
    //if needed for add and subtracting fractions. Then, an if statement calls the operation needed
    //according to the operator. 
    public static String produceAnswer(String input){ 
    	if (input.indexOf("/0") >= 0){
    		return "ERROR: Cannot divide by 0.";
    	} else if (input.indexOf(" ")< 0){
    		return "ERROR: Your equation is an improper format. Please add spaces in between operation and operands.";
    	}
        String operand1 ="";
        String operator ="";
        String operand2 ="";
        int[] fracSum = null;
        // String split through spaces
        String [] fracParts = input.split(" ");
        operand1 = fracParts[0];
        operator = fracParts[1];
        operand2 = fracParts[2];
        
        operand1 = operand1.trim(); 
        operator = operator.trim();
        operand2 = operand2.trim();
        //parsed operands
        //operands turned to improper fractions
        int [] fracArr = toImproperFrac(parseOperand(operand1));
        int [] fracArr2 = toImproperFrac(parseOperand(operand2));
        //improper fraction put through commonDenom to get the common denominator
        if (operator.equals("+")){
        	fracSum = addFrac(toCommonDenom(fracArr, fracArr2[1]), toCommonDenom(fracArr2, fracArr[1]));
        } else if (operator.equals("*")){
        	fracSum = multiplyFrac(fracArr, fracArr2);
        } else if (operator.equals("/")){ 
        	fracSum = divideFrac(fracArr, fracArr2);
        } else if (operator.equals("-")){
        	fracSum = subtractFrac(toCommonDenom(fracArr, fracArr2[1]), toCommonDenom(fracArr2, fracArr[1])); 
        } else {
        	return "ERROR: Input is in an invalid format.";
        }
		return simplifyFrac(toMixedNum(fracSum));
    }
    //Parses the operand to separate the whole number, numerator, and denominator 
    //using substring and indexOf into different parts and returns it as an array. 
    public static int[] parseOperand (String operand){
    	int denom;
        int numerator;
        int wholeNum;
        //checks if it is a fraction without a whole number and sets 0 as the whole number
        if ((operand.indexOf("/") >  0) && !(operand.indexOf("_") > 0) ){
        	numerator = Integer.parseInt(operand.substring(0, operand.indexOf("/")));
			denom = Integer.parseInt(operand.substring(operand.indexOf("/")+1));
			wholeNum = 0;
		//checks if just a whole number without any fraction and sets 1 as its denominator
        }else if(!(operand.indexOf("_") > 0) && (!(operand.indexOf("/")> 0))){
    		wholeNum = Integer.parseInt(operand);
    		numerator = 0;
    		denom = 1;
    	}else{
    	//everything else like regular three part fractions
    		numerator = Integer.parseInt(operand.substring(operand.indexOf("_")+1, operand.indexOf("/")));
    		denom = Integer.parseInt(operand.substring(operand.indexOf("/")+1));
    		wholeNum = Integer.parseInt(operand.substring(0,operand.indexOf("_")));
    	}
        int[] fracArrs = {wholeNum, numerator, denom};
        return fracArrs;
    }
    //Changes the accepted input, 3 integers, to change into an improper fraction.
    // Also makes sure the negative in a fraction doesn't get interpreted in changing
    //the whole number to the numerator. 
    public static int[] toImproperFrac (int[] fracArr){
    	int whole = fracArr[0];
    	int numer = fracArr[1];
    	int denom = fracArr[2];
    	int denomAndWhole = denom*whole;
    	if(whole < 0){
    		numer = (-1*denomAndWhole) + numer;
    		numer = -1 * numer;
    	} else {
    		numer = denomAndWhole + numer;
    	}
    	return new int[] {numer, denom};
    }
    //Simplifies and reduces the fraction by using greatest common factor and fixes negatives 
    //that get passed through in the denominator or mixed number fraction part also concatenates the final string
	public static String simplifyFrac (int[] fracArrs){
		String equation; 
		int wholeNum = fracArrs[0];
    	int numer = fracArrs[1];
    	int denom = fracArrs[2];
    	int gcf = gcf(numer, denom);
    	numer = numer / gcf;
    	denom = denom / gcf;
    	//Checks for extra negatives that accidently get returned through after GCF like -3_-4/-5 and turns that to -3_4/5.
    	if(wholeNum < 0 && ((numer < 0 ) && (denom < 0))){
    		numer *= -1;
    		denom *= -1;
    	}else if (wholeNum < 0 &&(numer < 0)){
    		numer *= -1;
    	}else if(wholeNum < 0 &&(denom < 0)){
    		denom *= -1;
    	}else if((wholeNum >= 0)&& (denom < 0 && numer > 0)){
    		denom*= -1;
    		numer *= -1;
    	}else if((wholeNum > 0)&& (denom < 0 && numer < 0)){
    		denom*= -1;
    		numer *= -1;
    	}
    	if ((denom == 1) || (numer == 0)){
    		equation = wholeNum + "";
    	}else if (wholeNum == 0){
    		equation = numer + "/" + denom;
    	}else{
    		equation = wholeNum + "_" + numer + "/" + denom;
    	}
    	return equation;
    }
	//Determines the greatest common factor
    public static int gcf(int num1, int num2){
		while (num1 != 0 && num2 != 0){
			int gcf = num2;
			num2 = num1 % num2;
			num1 = gcf;
		}
		int gcf = num1 + num2;
		if (gcf < 0){
			gcf *= -1;
		}
		return gcf;
	}
    //Changes the improper fraction to a mixed number
    public static int[] toMixedNum(int[] fracArrs){
    	
    	int denom = fracArrs[1];
    	int numer = fracArrs[0];
		int wholeNum = numer/denom;
		numer = fracArrs[0] % denom;
		return new int[] {wholeNum, numer, denom};
	}
    //determines product of two fractions (or whole numbers) It accepts 
    //two operand arrays and returns an array of the product
    public static int[] multiplyFrac (int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] * fracArr2[0];
    	int denom = fracArr[1] * fracArr2[1];
    	return new int[] {numerator, denom};
    }
    //determines sum of two fractions (or whole numbers)It accepts 
    //two operand arrays and returns an array of the sum
    public static int[] addFrac (int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] + fracArr2[0];
    	int denom = fracArr[1];
    	return new int[] {numerator, denom};
    }
    //determines difference of two fractions (or whole numbers)It accepts 
    //two operand arrays and returns an array of the difference
    public static int[] subtractFrac(int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] - fracArr2[0];
    	int denom = fracArr[1];
    	return new int[] {numerator, denom};
    }
    //determines quotient of two fractions (or whole numbers)It accepts 
    //two operand arrays and returns an array of the quotient
    public static int[] divideFrac (int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] * fracArr2[1];
    	int denom = fracArr[1] * fracArr2[0];
    	return new int[] {numerator, denom};
    }
    //takes an array of one operand and integer which is the denominator
    //of the other operand and multiplies the denominator of the other 
    //fraction to create a common denominator. Returns an array of the 
    // created fraction with new common denominator
    public static int[] toCommonDenom (int [] fracArr, int denomOfOtherFrac){
    	int newNumer;
    	int newDenom;
    	if (denomOfOtherFrac == fracArr[1]){
    		newNumer = fracArr[0];
    		newDenom = denomOfOtherFrac;
    	} else {
    		newNumer = fracArr[0] * denomOfOtherFrac; 
    		newDenom = fracArr[1] * denomOfOtherFrac;
    	}
    	return new int [] {newNumer, newDenom};
    }
}
