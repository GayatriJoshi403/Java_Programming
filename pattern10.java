//Input : 4
//output : 4  
/*1 1 1 1
2 2 2 2 
3 3 3 3  
4 4 4 4*/

import java.lang.*;
import java.util.*;

class pattern10
{
	public static void Display(int iRow,int iCol)
	{
		for(int i=1;i<=iRow;i++)
		{
			for(int j=1;j<=iCol;j++)
			{
				System.out.print(i+"\t");
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
