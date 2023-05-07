public class star206
{
	public static void main(String[] args) 
	{
		int irange=10;
		int jrange=10;

		for(int i=0;i<10;i=i+2)
		{
			int cnt=1;
			for(int j=0;j<10;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt);
					if(j<i/2)
					{
						cnt++;
					}
					else
					{
					cnt--;
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

1
121
12321
1234321
123454321

*/