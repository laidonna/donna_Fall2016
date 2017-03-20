package textExcel;

import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    //System.out.println("input yo stuff");
	    String cellDeclaration = input.nextLine();
	    Spreadsheet sprsheet = new Spreadsheet();
	    while(!cellDeclaration.equals("quit")){
	 	    System.out.println(sprsheet.processCommand(cellDeclaration));
		    cellDeclaration = input.nextLine();
	    }
	    TestsALL.Helper th = new TestsALL.Helper();
//	    System.out.println(th.getText());
//	    System.out.print(sprsheet.getGridText().toString());
	}
}
