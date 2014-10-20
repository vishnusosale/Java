package patterns;

public class Pattern8{
	
	public void run()
	{
		System.out.println("running pattern 8");
		for(int i = 1; i<=5; i++)
		{
			for(int k = 5; k>=i; k--)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}

}
