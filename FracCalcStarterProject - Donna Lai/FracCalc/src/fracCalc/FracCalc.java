package fracCalc;

import java.util.Scanner;
import java.util.*;

public class FracCalc {

    public static void main(String[] args){
        // TODO: Read the input from the user and call produceAnswer with an equation
    	Scanner input = new Scanner(System.in);
    	System.out.println("Please input the equation you want answered.");
    	String equation = input.nextLine();
    	while(!equation.equals("quit")){
    		System.out.println(produceAnswer(equation));
    		System.out.println("Please input the equation you want answered.");
    		equation = input.nextLine();
    	}
    }
    
    public static String produceAnswer(String input){ 

        String operand1 ="";
        String operator ="";
        String operand2 ="";
        String fracSum = null;
        // String split through spaces
        String [] fracParts = input.split(" ");
        operand1 = fracParts[0];
        operator = fracParts[1];
        operand2 = fracParts[2];
        
        operand1 = operand1.trim(); 
        operator = operator.trim();
        operand2 = operand2.trim();
        
        System.out.println(operator);
//        if(input.indexOf(" + ") > 0){
//        	operand1 = input.substring(0, input.indexOf("+")-1);
//        	operator = " + ";
//        	operand2 = input.substring(input.indexOf("+") +2);
//        } else if (input.indexOf(" - ") > 1){
//        	operand1 = input.substring(0, input.indexOf(" -")-1);
//        	operator = " - ";
//        	operand2 = input.substring(input.indexOf(" -") +2);
//        } else if (input.indexOf(" / ")>0){
//        	operand1 = input.substring(0, input.indexOf(" /")-1);
//        	operator = " / ";
//        	operand2 = input.substring(input.indexOf(" /") +2);
//        } else {
//        	operand1 = input.substring(0, input.indexOf("*")-1);
//        	operator = " * ";
//        	operand2 = input.substring(input.indexOf("*") +2);
//        }
        
        int denom;
        int numerator;
        int wholeNum;
        
        int denom2;
        int numerator2;
        int wholeNum2;
        
        if ((operand1.indexOf("/") >  0) && !(operand1.indexOf("_") > 0) ){
        	numerator = Integer.parseInt(operand1.substring(0, operand1.indexOf("/")));
			denom = Integer.parseInt(operand1.substring(operand1.indexOf("/")+1));
			wholeNum = 0;
    	}else if(!(operand1.indexOf("/") > 0)){
    		wholeNum = Integer.parseInt(operand1.substring(0, operand1.indexOf("_")));
    		numerator = 0;
    		denom = 1;
    	}else{
    		numerator = Integer.parseInt(operand1.substring(operand1.indexOf("_")+1, operand1.indexOf("/")));
    		denom = Integer.parseInt(operand1.substring(operand1.indexOf("/")+1));
    		wholeNum = Integer.parseInt(operand1.substring(0,operand1.indexOf("_")));
    	}
        
        if((operand2.indexOf("/") > 0) && !(operand2.indexOf("_") > 0)){
			numerator2 = Integer.parseInt(operand2.substring(0, operand2.indexOf("/")));
			denom2 = Integer.parseInt(operand2.substring(operand2.indexOf("/")+1));
			wholeNum2 = 0;	
    	}else if(! (operand2.indexOf("/") > 0)){
    		wholeNum2 = Integer.parseInt(operand2.substring(0, operand2.indexOf("_")));
    		numerator2 = 0;
    		denom2 = 1;
    	}else{	
            numerator2 = Integer.parseInt(operand2.substring(operand2.indexOf("_")+1,operand2.indexOf("/")));
            denom2 = Integer.parseInt(operand2.substring(operand2.indexOf("/")+1));	
            wholeNum2 = Integer.parseInt(operand2.substring(0, operand2.indexOf("_")));
    	}
        int[] fracArr = toImproperFrac(wholeNum, numerator, denom);
        int[] fracArr2 = toImproperFrac(wholeNum2, numerator2, denom2);
        int[] firstFrac = commonDenom(fracArr, denom2);
    	int[] secFrac = commonDenom(fracArr2, denom);
    	
        if (operator.equals("+")){
        	fracSum = addFrac(firstFrac, secFrac);
        } else if (operator.equals("*")){
        	fracSum = multiplyFrac(fracArr, fracArr2);
        } else if (operator.equals("/")){ //i
        	fracSum = divideFrac(fracArr, fracArr2);
        } else if (operator.equals("-")){
        	fracSum = subtractFrac(firstFrac, secFrac); // i
        } else {
        	return " Error: You must have done something wrong! Your operators are messed up.";
        }
		return fracSum;
       
        
    }
    public static int[] toImproperFrac (int whole, int numerator, int denominator){
    	System.out.println("whole:" + whole);
    	System.out.println("denom:" + denominator);
    	System.out.println("numer:" + numerator);
    	int denomAndWhole = denominator*whole;
    	//System.out.println("denom and whole:" + denomAndWhole);
		numerator = denomAndWhole + numerator; 
		System.out.println("numer: "+ numerator + " denom:" + denominator);
		int[] improperFracArr = {numerator, denominator};
		return improperFracArr;
    }
    
    public static String multiplyFrac (int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] * fracArr2[0];
    	int denom = fracArr[1] * fracArr2[1];
    	return numerator + "/" + denom;
    }
    
    public static String addFrac (int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] + fracArr2[0];
    	int denom = fracArr[1];
    	return numerator + "/" + denom;
    }
    
    public static String subtractFrac(int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] - fracArr2[0];
    	int denom = fracArr[1];
    	return numerator + "/" + denom;
    }
    
    public static String divideFrac (int[] fracArr, int[] fracArr2){
    	int numerator = fracArr[0] * fracArr2[1];
    	int denom = fracArr[1] * fracArr2[0];
    	return numerator + "/" + denom;
    }
    
    public static int[] commonDenom (int [] fracArr, int commonDenominator){
    	int newNumer = fracArr[0] * commonDenominator; 
    	int newDenom = fracArr[1] * commonDenominator;
    	int[] commonDen = {newNumer, newDenom};
    	return commonDen;
    }
}
