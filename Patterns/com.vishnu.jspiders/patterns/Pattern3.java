package patterns;

public class Pattern3{
	
	public void run()
	{
		System.out.println("running pattern 3");
		for(int i = 5; i>=1; i--)
		{
			for(int k = 1; k<=i; k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
