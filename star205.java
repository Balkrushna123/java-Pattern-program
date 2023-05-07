public class star205
{
	public static void main(String[] args) 
	{
		int irange=10;
		int jrange=10;

		for(int i=2;i<10;i=i+2)
		{
			for(int j=0;j<10;j++)
			{
				if(j-i<=0)
				{
					if(i==j*2)
					{
						System.out.print(" ");
					}
					else
					{
					System.out.print("*");
				}
			}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}

/*

* *
** **
*** ***
**** ****

*/
