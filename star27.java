//check
public class star27
{
	public static void main(String[] args) 
	{
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j+i>=4 && j-i>=-4)
				{
					System.out.print(1+i);
				}
				else if(j-i>=-4 && i>4)
				{
					System.out.print(9-i);
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
