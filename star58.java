public class star58
{
	public static void main(String[] args) 
	{
		int num=0;
		for(int i=0;i<9;i++)
		{
			num=1;
			for(int j=0;j<5;j++)
			{
				if(j+i<=4 || j-i<=-4)
				{
					System.out.print(num);
					num++;
				}
			}
			System.out.println();
		}
		
	}
}

/*
12345
1234
123
12
1
12
123
1234
12345
 */