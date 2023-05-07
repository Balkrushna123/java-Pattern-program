public class star24
{
	public static void main(String[] args) 
	{
		int num=0;
		for(int i=0;i<9;i++)
		{
			if(i<=4)
			{
				num++;
			}
			else
			{
				num--;
			}
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && j-i>=-4)
				{
					System.out.print(num+" ");
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
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1

    */
