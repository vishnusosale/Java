package patterns;

public class Pattern7{
	
	public void run()
	{
		System.out.println("running pattern 7");
		for(int i = 1; i<=5; i++)
		{
			for(int k = 5; k>=i; k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
