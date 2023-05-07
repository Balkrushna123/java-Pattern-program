public class star204
{
	public static void main(String[] args) 
	{
		int irange=5;
		int jrange=5;

		int cnt=1;
		for(int i=0;i<5;i++)
		{
			int cnt2=cnt;
			int diff=4;
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(cnt2+" ");
					cnt2=cnt2+diff;
					diff--;
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
2 6
3 7 10
4 8 11 13
5 9 12 14 15

*/