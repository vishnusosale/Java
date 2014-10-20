package patterns;

public class Pattern6{
	
	public void run()
	{
		System.out.println("running pattern 5");
		
		for(int i = 5; i>=1; i--)
		{
			for(int k = 1; k<=i; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		for(int i = 1; i<=5; i++)
		{
			for(int k = 1; k<=i; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
		
		
	}

}