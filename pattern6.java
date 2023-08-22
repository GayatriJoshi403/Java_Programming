//Input : 4
//output : -4 -3 -2 -1 0 1 2 3 4 

import java.lang.*;
import java.util.*;

class pattern6
{
	public static void Display(int iNo)
	{
		for(int iCnt=-iNo;iCnt<=iNo;iCnt++)
		{
			System.out.print(iCnt+"\t");
		}
		System.out.println();
		
	}
	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
				
		System.out.println("Please enter value :");
		iValue=sobj.nextInt();
		
		Display(iValue);
	}
}
