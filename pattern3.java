//Input : 5
//output : 5 4 3 2 1

import java.lang.*;
import java.util.*;

class pattern3
{
	public void Display(int iNo)
	{
		int iCnt=0;
		
		for(iCnt=iNo;iCnt>=1;iCnt--)
		{
			System.out.print(iCnt+"\t");
		}
		System.out.println();
	}

	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Please enter value ");
		iValue=sobj.nextInt();
		
		pattern3 pobj=new pattern3();
		
		pobj.Display(iValue);
		
	}
}


