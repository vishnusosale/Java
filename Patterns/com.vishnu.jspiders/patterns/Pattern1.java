package patterns;

public class Pattern1 {
	
	public void run()
	{
		System.out.println("running pattern 1");
		for(int i = 1; i<=5; i++)
		{
			for(int k = 1; k<=i; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
