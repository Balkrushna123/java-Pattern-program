public class star201
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
					count=count+2;
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
13
135
1357
13579

*/