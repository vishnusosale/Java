package patterns;

public class Pattern2{
	
	public void run()
	{
		System.out.println("running pattern 2");
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
