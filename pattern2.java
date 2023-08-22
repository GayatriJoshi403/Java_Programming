//Input : 5
//output : 1 2 3 4 5

import java.lang.*;
import java.util.*;

class pattern2
{
	public static void Display(int iNo)
	{	
		for(int iCnt=1;iCnt<=iNo;iCnt++)
		{
			System.out.print(iCnt+"\t");
		}

		System.out.println();
		
	}
	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("please enter value :");
		iValue=sobj.nextInt();
		
		Display(iValue);		
		
	}
}
