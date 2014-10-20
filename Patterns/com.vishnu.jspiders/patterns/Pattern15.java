package patterns;

public class Pattern15{
	
	public void run()
	{
		System.out.println("running pattern 15");
		
		for(int i = 1; i<=5 ; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(i);
			}
			
			for(int k = 1; k<i; k++)
			{
				System.out.print(" ");
			}
			
			
			
			System.out.println();
			
		}
	}

}