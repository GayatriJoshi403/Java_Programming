//Input : 5
//output : 1 * 3 * 5 *  

import java.lang.*;
import java.util.*;

class pattern7
{
	public static void Display(int iNo)
	{
		for(int iCnt=1;iCnt<=iNo;iCnt++)
		{
			if(iCnt%2==0)
			{
				System.out.print("*"+"\t");
			}
			else
			{
				System.out.print(iCnt+"\t");
			}
		}
		System.out.println();
		
	}
	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Please enter value : ");
		iValue=sobj.nextInt();
		
		Display(iValue);
	}
}
