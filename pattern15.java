// Input :  Row 4   Columns     4
/*

*   *   *   *
*           *
*           *
*   *   *   *

*/

import java.lang.*;
import java.util.*;

class pattern15
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		
		if(iRow!=iCol)
		{
			System.out.println("Invalid input");
			return ;
		}
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==1)||(i==iRow)||(j==1)||(j==iCol))
				{
					System.out.print("*"+"\t");
				}
				else
				{
					System.out.print(" "+"\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows : ");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter number of column : ");
		iValue2=sobj.nextInt();
		
		Display(iValue1,iValue2);
	}
}
