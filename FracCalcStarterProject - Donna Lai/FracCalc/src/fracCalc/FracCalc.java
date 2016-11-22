package fracCalc;

import java.util.Scanner;

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
        
        if(input.indexOf(" + ") > 0){
        	operand1 = input.substring(0, input.indexOf("+"));
        	operator = "+";
        	operand2 = input.substring(input.indexOf("+") +2);
        } else if (input.indexOf(" - ") > 0){
        	operand1 = input.substring(0, input.indexOf("-"));
        	operator = "-";
        	operand2 = input.substring(input.indexOf("-") +2);
        } else if (input.indexOf(" /")>0){
        	operand1 = input.substring(0, input.indexOf("/"));
        	operator = "/";
        	operand2 = input.substring(input.indexOf("/") +2);
        } else {
        	operand1 = input.substring(0, input.indexOf("*"));
        	operator = "*";
        	operand2 = input.substring(input.indexOf("*") +2);
        }
        
        int denom =1;
        int numerator =0;
        int wholeNum =0;
        
        int denom2 =1;
        int numerator2 =0;
        int wholeNum2 =0;
        
        if ((operand1.indexOf("/") >  0)&& !(operand1.indexOf("_") > 0) ){
        	numerator = Integer.parseInt(operand1.substring(0, operand1.indexOf("/")));
			denom = Integer.parseInt(operand1.substring(operand1.indexOf("/")+1));
    	}else if(!(operand1.indexOf("/ ") > 0)){
    		wholeNum = Integer.parseInt(operand1.substring(0, operand1.indexOf("_")));
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
    		wholeNum2 = Integer.parseInt(operand2.substring(0, operand2.indexOf("_")));
            numerator2 = Integer.parseInt(operand2.substring(operand2.indexOf("_")+1,operand2.indexOf("/")));
            denom2 = Integer.parseInt(operand2.substring(operand2.indexOf("/")+1));	
    	}
        return "whole:" + wholeNum2 + " numerator:" + numerator2 + " denominator:" + denom2;
    }
}
