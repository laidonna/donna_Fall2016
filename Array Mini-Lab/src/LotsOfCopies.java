
public class LotsOfCopies {

	public static void main(String[] args){
		int num = 7;
		String strMain = "APCS";
		int [] arrMain = {1,2,3,4,5};	
		//System.out.println(arrMain);
		ChangeMe( num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(arrMain);
				
	}
	public static void ChangeMe(int a){
		int b;
		a = 5; 
		b = a;
		a = 7;
	}
}
