package patterns;

public class Pattern11{
	
	public void run()
	{
		System.out.println("running pattern 11");
		
		for(int i = 1; i<=5 ; i++)
		{
			
			
			for(int k = 5; k>i; k--)
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j);
			}
			
			
			System.out.println();
			
		}
	}

}