package textExcel;

public class SpreadsheetLocation implements Location{
	int row;
	char column;
	
    @Override
    public int getRow(){
        return row - 1;
    }

    @Override
    public int getCol(){
    	int col;
    	if (column > 90){
    		col = column - 97;
    	}else{
    		col = column - 65; 
    	}
    	return col;
    }
    
    public SpreadsheetLocation(String cellName){
        row = Integer.parseInt(cellName.substring(1));
        column = cellName.charAt(0);
    }

}
