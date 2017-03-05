package textExcel;

public class SpreadsheetLocation implements Location{
	int row;
	char column;
	
    @Override
    public int getRow(){
        row -= 1;
        return row;
    }

    @Override
    public int getCol(){
    	int col = column - 65; 
        return col;
        
    }
    
    public SpreadsheetLocation(String cellName){
        row = Integer.parseInt(cellName.substring(1));
        column = cellName.charAt(0);
    
    }

}
