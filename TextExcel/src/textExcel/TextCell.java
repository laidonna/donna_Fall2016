package textExcel;

public class TextCell implements Cell {

	private String text;
	@Override
	public String abbreviatedCellText() {
		String truncate = text;
		truncate += "          ";
		return truncate.substring(0,10); 
	}

	@Override
	public String fullCellText() {
		
		return   "\"" + text + "\"" ;
	}
	
	public TextCell(String input){
		text = input;
	}

}
