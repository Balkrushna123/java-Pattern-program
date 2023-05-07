public class star24
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i<=4)
				{
					System.out.print(1+j+i);
				}
			}
			System.out.println();
		}
		
	}
}

/*

12345
2345
345
45
5

*/
