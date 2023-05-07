public class star202
{
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;

		int cnt=1;
		for(int i=0;i<5;i++)
		{
			int cnt2=cnt;
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt2);
					cnt2--;
				}
				else
				{
					System.out.print(" ");
				}
			}
			cnt++;
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