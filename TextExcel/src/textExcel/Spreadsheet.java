package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	private Cell[][] sheet = new EmptyCell[20][12];; 
	private String alphabet = "ABCDEFGHIJKL";
	
	public Spreadsheet(){
	//	sheet = new EmptyCell[20][12];  
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
				sheet[i][j] = new EmptyCell();
			}
		}
	}
	
	@Override
	public String processCommand(String command){
		if(command.equalsIgnoreCase("")){
			return "";
		}
		if (command.indexOf(" ") > 0){
			String[] commandBreakdown = command.split(" ", 3);
			if (commandBreakdown.length > 1){
				if (commandBreakdown[1].equals("=")){
					String location = commandBreakdown[0];
					SpreadsheetLocation cellLocation = new SpreadsheetLocation(location);
					int rowNum = cellLocation.getRow();
					int columnNum = cellLocation.getCol();
					
						sheet[rowNum][columnNum] = new TextCell(commandBreakdown[2].substring(1, commandBreakdown[2].length()-1));
					
					return (getGridText());
				} else if (commandBreakdown[0].equalsIgnoreCase("clear")){
					SpreadsheetLocation cellLocation = new SpreadsheetLocation(commandBreakdown[1]);
					sheet[cellLocation.getRow()][cellLocation.getCol()] = new EmptyCell();
					return (getGridText());
				}
			}
		}else if (command.equalsIgnoreCase("clear")){
			for( int i = 0; i < sheet.length; i++){
				for (int j = 0; j<sheet[i].length; j++){
					sheet[i][j] = new EmptyCell();
				}
			}
			return (getGridText());
		} else if(command.length() < 5){
			SpreadsheetLocation cellLocation = new SpreadsheetLocation(command);
			return (getCell(cellLocation).fullCellText());
		}
		return "";
	}
//		
//		SpreadsheetLocation loca;
//		int row;
//		int col;
//		String placeholder = "";
//		String location = "";
//		
//		if (command.equals("")){
//			return "";
//		}
//		String[] commandSplit = command.split(" ", 3);
//		
//		if(command.equalsIgnoreCase("clear")){
//			clearCells();
//			placeholder = getGridText();
//		}else if(commandSplit[0].equalsIgnoreCase("clear")){
//			location = commandSplit[1];
//			loca = new SpreadsheetLocation(location);
//			sheet[loca.getRow()][loca.getCol()] = new EmptyCell();
//			placeholder = getGridText();
//		}else if(commandSplit[1].equals("=")){
//			location = commandSplit[0];
//			loca = new SpreadsheetLocation(location);
//			row = loca.getRow();
//			col = loca.getCol();
//			String userIn = commandSplit[2];
//			sheet[row][col] = new TextCell(userIn); 
//		}else{
//			loca = new SpreadsheetLocation(command);
//			Cell getCell = sheet[loca.getRow()][loca.getCol()];
//			placeholder = getCell.toString();
//		}
//		
//		return placeholder;
//	}
		

	
	
	
	public void clearCells(){
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 12; j++) {
				sheet[i][j] = new EmptyCell();
			}
		}
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
		int r = loc.getRow();
		int c = loc.getCol();
		return sheet[r][c];
	}

	@Override
	public String getGridText(){
		String firstRow ="   ";
		String newLn = "";
		for(int l = 0; l < sheet[0].length; l++){
			firstRow += "|" + alphabet.charAt(l)+"         ";
		}
		for(int i = 0; i < sheet.length; i++){
			if (i < 9){
				newLn += (i + 1) + "  |" ;
			}else{
				newLn += (i + 1) + " |";
			}
			for(int l = 0; l < sheet[0].length; l++){
				newLn += sheet[i][l].abbreviatedCellText()+ "|";
			}
			newLn+= "\n";
		}
		return firstRow + "\n"  +newLn ; 
	}

}
