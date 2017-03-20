package textExcel;

public class TextCell implements Cell {

	private String text;
	@Override
	public String abbreviatedCellText() {
		String input = "";
		if (text.length()<10){
			input = text;
			for(int i = 0; i < 10; i++){
				input += " "; 
			}
		}else{
			for(int i = 0; i < 10; i++){
				input += text.charAt(i);
			}
		}
		return input;
	}

	@Override
	public String fullCellText() {
		
		return "\"" + text + "\"";
	}
	
	public TextCell(String input){
		text = input;
	}

}
