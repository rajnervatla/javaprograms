package programs;

public class OccurancesOfCharacrters {

	
	public static void main(String[] args) {
		
		String str=" Java Programming java opps";
		/*Logic 
		 * 1.find total length*/
		
		int total_length=str.length();
		int totalcountafter_remove=str.replace("a","").length();// removing afte reming a' s
		
		int count=total_length-totalcountafter_remove;
		System.out.println(count);
	}
}
