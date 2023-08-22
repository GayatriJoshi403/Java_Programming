//Input : 5
//output : * * * * *

import java.lang.*;
import java.util.*;

class pattern1
{
	//public static void Display(int iNo)
	public void Display(int iNo)
	{
		int iCnt;
		
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			System.out.print("*\t");
		}
		
		System.out.println();
	
	}
	public static void main(String arg[])
	{
		int iValue=0,iCnt=0;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Please enter value");
		iValue=sobj.nextInt();
		
		pattern1 pobj=new pattern1();
		
		//Display(iValue);
		
		pobj.Display(iValue);
		
	}
}
