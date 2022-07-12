package java;

public class ThrowKeyword {

	
	public static void checkPassEligibility(float totalMarks){
	    if(totalMarks > 33){
	        System.out.println("Student passed");
	    }   
	    else {
	        throw new ArithmeticException("Student failed");
	    }
	  }
	    
	  public static void main(String[] args){
	   // ThrowKeyword te = new ThrowKeyword();
	    System.out.print("Hi! Please check your score");
	    ThrowKeyword.checkPassEligibility(31);
	    System.out.println("Thank you!");
	  }
}
