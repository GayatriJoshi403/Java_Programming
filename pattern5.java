//Input : 4
//output : 1 2 3 4 4 3 2 1

import java.lang.*;
import java.util.*;

class DisplayStar
{
	public void Display(int iNo)
	{
		int iCnt=0;
		
		for(iCnt=1;iCnt<=iNo;iCnt++)
		{
			System.out.print(iCnt+"\t");
		}
		for(iCnt=iNo;iCnt>=1;iCnt--)
		{
			System.out.print(iCnt+"\t");
		}
		System.out.println();
	}
}
class pattern5
{
	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Please enter the value");
		iValue=sobj.nextInt();

		DisplayStar dobj=new DisplayStar();		
		dobj.Display(iValue);
	}
}
