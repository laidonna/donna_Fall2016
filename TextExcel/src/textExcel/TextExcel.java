package textExcel;

import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    System.out.println("input yo stuff");
	    String cellDeclaration = input.nextLine();
	    Spreadsheet sheet = new Spreadsheet();
	    while(!cellDeclaration.equals("quit")){
	    	cellDeclaration = input.nextLine();
	 	    System.out.println(sheet.processCommand(cellDeclaration));
		    cellDeclaration = input.nextLine();
	    }
	    TestsALL.Helper th = new TestsALL.Helper();
	    System.out.println(th.getText());
	    System.out.print(sheet.getGridText());
	}
}
