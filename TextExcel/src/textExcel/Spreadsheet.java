package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	private Cell[][] sheet; 
	private String alphabet = "ABCDEFGHIJKL";
	
	public Spreadsheet(){
		sheet = new EmptyCell[20][12];  
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
				sheet[i][j] = new EmptyCell();
			}
		}
		
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
		String firstRow ="   ";
		String restOfCells = "";
		String num ="";
		String h = "";
		String newLn = "\n";
		for(int i = 0; i < sheet.length; i++){
			
			for(int l = 0; l < sheet[0].length; l++){
				firstRow += "|" + alphabet.charAt(l)+"         ";
				
				restOfCells += sheet[i][l].abbreviatedCellText()+ "|";
				num += i + "|" ; 
			}
			restOfCells+= newLn;
		}
		return firstRow + "\n"  +restOfCells + h + num; 
	}

}
