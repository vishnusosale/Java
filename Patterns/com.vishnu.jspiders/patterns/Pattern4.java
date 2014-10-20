package patterns;

public class Pattern4{
	
	public void run()
	{
		System.out.println("running pattern 4");
		for(int i = 5; i>=1; i--)
		{
			for(int k = 1; k<=i; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}