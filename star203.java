public class star203
{
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(i-j+1);
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

1
21
321
4321
54321

*/