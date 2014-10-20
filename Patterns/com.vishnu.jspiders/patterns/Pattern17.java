package patterns;

public class Pattern17 {

	public void run() {
		int num = 5, r, c, sp;

		System.out.println("Printing pattern 17");
		
		for (r = 1; num >= r; r++) 
		{
			for (sp = num - r; sp >= 1; sp--)
				System.out.print(" ");
			
			for (c = r; c >= 1; c--)
				System.out.print("*");
			
			for (c = r; c > 1; c--)
				System.out.print("*");
			
			System.out.println();
		}
	}

}
