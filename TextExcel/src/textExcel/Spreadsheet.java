package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	private Cell[][] sheet; 
	private String alphabet = "ABCDEFGHIJKL";
	public Spreadsheet(){
		sheet = new EmptyCell[20][12];  
		
	}

	
	@Override
	public String processCommand(String command){
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
		String a ="   ";
		String restOfCells;
		return a;
		for(int j = 0; j < sheet.length; j++){
			a += "|" + alphabet.charAt(j)+"         ";
			for (int k = 0; k < sheet[j].length; k++){
				sheet[k][j] = EmptyCell.CellText();
			}
		}
	}

}
