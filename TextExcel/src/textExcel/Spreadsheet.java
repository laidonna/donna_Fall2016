package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	private EmptyCell[][] sheet; 
	public Spreadsheet(){
		sheet = new EmptyCell[20][12];  
		
	}

	@Override
	public String processCommand(String command){
//		SpreadsheetLocation sLoc = new SpreadsheetLocation(command);
//		command = sLoc.getRow() + " " + sLoc.getCol(); 
		return command;
	}

	@Override
	public int getRows(){
		int rows = sheet.length;
		return rows;
	}

	@Override
	public int getCols(){
		int columns = sheet[0].length;
		return columns;
	}

	@Override
	public Cell getCell(Location loc){
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText(){
		// TODO Auto-generated method stub
		return null;
	}

}