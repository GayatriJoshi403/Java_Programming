//Input : 4
//output : 4  
/*1 2 3 4
1 2 3 4
1 2 3 4 
1 2 3 4*/

import java.lang.*;
import java.util.*;

class pattern9
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows :");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter number of column :");
		iValue2=sobj.nextInt();
		
		Display(iValue1,iValue2);
	}
}
