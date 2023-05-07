public class star20
{
	public static void main(String[] args) 
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && i<=4)
				{
					System.out.print(1+i +" ");
				}
				else if(j-i>=-4 && i>4)
				{
					System.out.print(9-i +" ");
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