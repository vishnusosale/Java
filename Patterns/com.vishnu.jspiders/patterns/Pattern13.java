package patterns;

public class Pattern13{
	
	public void run()
	{
		System.out.println("running pattern 13");
		
		for(int i = 1; i<=5 ; i++)
		{
			
			
			for(int k = 1; k<i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j = 5; j>=i; j--)
			{
				System.out.print(j);
			}
			
			System.out.println();
			
		}
	}

}