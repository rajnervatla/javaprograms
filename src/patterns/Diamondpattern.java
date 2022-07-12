package patterns;

public class Diamondpattern {
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1,p=1;i<n;i++,p++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<i;j++)
			{
				System.out.println(p+"");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.println(p+"");
			}
			System.out.println();
		}
		for(int i=1,p=5;i<n;i++,p--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.println();
			}
			for(int j=i;j<n;j++)
			{
				System.out.println(p+"");
			}
			for(int j=i;i<=n;j++)
			{
				System.out.println(p+"");
			}
			System.out.println("");
		}
	}

}
