package textExcel;

public class RealCell implements Cell {
	private String strContents;
	@Override
	public String abbreviatedCellText() {
		// TODO Auto-generated method stub
		return "          ";
	}

	@Override
	public String fullCellText() {
		// TODO Auto-generated method stub
		return strContents;
	}
	
	public RealCell(String contents){
		strContents = contents;
	}
	
	public double getDoubleValue(String content){
		return Double.parseDouble(content);
	}
}
