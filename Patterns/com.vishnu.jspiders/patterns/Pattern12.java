package patterns;

public class Pattern12{
	
	public void run()
	{
		System.out.println("running pattern 12");
		
		for(int i = 1; i<=5 ; i++)
		{
			
			
			for(int k = 1; k<i; k++)
			{
				System.out.print(" ");
			}
			
			for(int j = 5; j>=i; j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}