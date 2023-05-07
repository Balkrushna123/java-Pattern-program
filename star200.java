public class star200
{
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;
		for(int i=0;i<5;i++)
		{
			int count=1;
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(count);
					count++;
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
12
123
1234
12345

*/