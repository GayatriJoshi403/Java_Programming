// Input :  Row 4   Columns    4

//5 4 3 2 1
//5 4 3 2
//5 4 3
//5 4
//5

import java.lang.*;
import java.util.*;

class pattern26
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		
		if(iRow!=iCol)
		{
			System.out.println("Invalid Input");
			return;
		}
		for(i=1;i<=iRow;i++)
		{
			for(j=iCol;j>=1;j--)
			{
				if(i<=j)
				{
					System.out.print(j+"\t");	
				}
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
		
		System.out.println("Enter number of columns :");
		iValue2=sobj.nextInt();
		
		Display(iValue1,iValue2);	
	}
}
