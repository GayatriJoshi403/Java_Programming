// Input :  Row 4   Columns    4
/*

A
B   B
C   C   C
D   D   D   D

a
b b
c c c
d d d d
*/
 
import java.lang.*;
import java.util.*;

class pattern20
{
	public static void Display(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch='\0';
		
		if(iRow!=iCol)
		{
			System.out.println("Invalid input");
			return;
		}
		for(i=1,ch='A';i<=iRow;i++,ch++)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i>=j)
				{
					System.out.print(ch+"\t");
				}
			}
			System.out.println();
		}
	}
	public static void main(String arg[])
	{
		int iValue1=0,iValue2=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the number of rows :");
		iValue1=sobj.nextInt();
		
		System.out.println("Enter the number of column :");
		iValue2=sobj.nextInt();
		
		Display(iValue1,iValue2);
		
	}
}
