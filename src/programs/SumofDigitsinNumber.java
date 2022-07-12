package programs;

public class SumofDigitsinNumber {
	
	public static void main(String[] args) {
		
		//num 12345
		int num=12345;
		int sum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}

}
