public class star60a
{
	public static void main(String[] args) 
	{
		int num1=1;
		for(int i=0;i<5;i++)
		{
			int num2=num1;
			num1++;
			int diff=4;
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print((char)(num2+64)+" ");
					num2=num2+diff;
					diff--;
				}
			}
			System.out.println();
		}
		
	}
}

/*
A
B F
C G J
D H K M
E I L N O
*/