public class star18
{
	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j-i<=0)
				{
					System.out.print(j+1);
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