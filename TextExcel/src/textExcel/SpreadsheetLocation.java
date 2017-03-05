package textExcel;

public class SpreadsheetLocation implements Location{
	int row;
	char column;
	
    @Override
    public int getRow(){
        return row-= 1;
    }

    @Override
    public int getCol(){
    	return column - 65; 
    }
    
    public SpreadsheetLocation(String cellName){
        row = Integer.parseInt(cellName.substring(1));
        column = cellName.charAt(0);
    }

}
