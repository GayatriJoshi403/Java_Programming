//1
//1 0
//1 0 1
//1 0 1 0
//1 0 1 0 1

import java.lang.*;
import java.util.*;

class pattern27
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
			for(j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("0\t");
				}
				else
				{
					System.out.print("1\t");	
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
