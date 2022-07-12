package programs;

public class RemovejunkOrSpecialCharasInString {
	
	public static void main(String[] args) {
		
		String str="1785t7834jkagfuit289t9ckh!@#@$@$...............@#%$$$*(&$&()";
		str=str.replaceAll("[^a-zA-Z0-9$.]", "");
		System.out.println(str);
		
		
	}
	
	
	
	

}
