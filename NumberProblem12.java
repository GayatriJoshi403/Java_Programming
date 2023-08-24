//search last occurrence of number in array

import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static int SearchLastOccurrence(int Arr[],int iNo)
	{
		int iCnt=0;
		
		for(iCnt=(Arr.length-1);iCnt>=0;iCnt--)
		{
			if(Arr[iCnt]==iNo)
			{
				break;
			}
		}
		
		return iCnt;
	}
	public static void main(String arg[])
	{
		int iSize=0,iCnt=0,iRet=0,iValue=0;
		int Brr[];
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements ");
		iSize=sobj.nextInt();
		
		Brr=new int[iSize];
		
		System.out.println("Enter elements in array");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}
		System.out.println("Enter element to search");
		iValue=sobj.nextInt();
		
		iRet=SearchLastOccurrence(Brr,iValue);
	
		if(iRet==-1)
		{
			System.out.println("There is no such element in array");
		}
		else
		{
			System.out.println("Element is occur at : "+iRet);	
		}
	}
}
