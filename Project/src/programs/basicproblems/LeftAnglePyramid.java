package programs.basicproblems;

public class LeftAnglePyramid {
	public static void main(String arg[])
	{
		
		for(int i = 5 ; i > 0; i--)
		{
			for(int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}

/*
 * s 0 i 1 n 5 st 5
 * s 1 i 2 n 5 st 4
 * s 2 i 3 n 5 st 3
 */
