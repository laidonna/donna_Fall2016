package textExcel;

import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		Spreadsheet sheet = new Spreadsheet();
	    Scanner input = new Scanner(System.in);
	    String cellDeclaration = input.nextLine();
	    while(!input.equals("quit")){
	    	cellDeclaration = input.nextLine();
	 	    System.out.println(sheet.processCommand(cellDeclaration));
		    cellDeclaration = input.nextLine();
	    }
	   
	}
}
