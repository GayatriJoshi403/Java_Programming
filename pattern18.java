// Input :  Row 4   Columns    4
/*

    a   b   c   d
    a   b   c   d
    a   b   c   d
    a   b   c   d

*/

import java.lang.*;
import java.util.*;

class pattern18
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch='\0';
		
		if(iRow!=iCol)
		{
			System.out.println("Invalid Input");
			return;
		}
		for(i=1;i<=iRow;i++)
		{
			for(j=1,ch='a';j<=iCol;j++,ch++)
			{
				System.out.print(ch+"\t");
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
