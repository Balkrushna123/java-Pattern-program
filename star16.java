/*

  ***     ***
  *****   *****
 ******* *******
*****************
*****************
 ***************
  *************
   ***********
    *********
     *******
      *****
       ***
        *

        */

public class star16
{
	public static void main(String[] args) 
	{
		for(int i=0;i<13;i++)
		{
			for(int j=0;j<17;j++)
			{
				if((j+i>=3 && j-i<=5 && j<=8 && j-i>=-4)|| (j>=8 && j+i>=11 && j-i<=13 && j+i<=20))
				{
					System.out.print("*");
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