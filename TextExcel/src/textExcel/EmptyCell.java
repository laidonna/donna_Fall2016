package textExcel;

public class EmptyCell implements Cell {
	String empty;
	public EmptyCell(){
		empty = "";
	}

	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return "          ";
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return "";
	}
	
}
