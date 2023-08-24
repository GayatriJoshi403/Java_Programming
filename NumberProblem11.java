//search first occurrence of number in array

import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static int SearchFirstOccurrence(int Arr[],int iNo)
	{
		int iCnt=0,iFirst=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				break;
			}
		}
		if(iCnt==Arr.length)
		{
			return -1;
		}
		else
		{
			return iCnt;
		}
	}
	public static void main(String arg[])
	{
		int iSize=0,iCnt=0,iRet=0,iValue=0;
		int Brr[];
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		iSize=sobj.nextInt();
		
		Brr=new int[iSize];
		
		System.out.println("Enter elements in array");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}
		System.out.println("Enter element to search");
		iValue=sobj.nextInt();
		
		iRet=SearchFirstOccurrence(Brr,iValue);
	
		if(iRet==-1)
		{
			System.out.println("There is no such element in array ");
		}
		else
		{
			System.out.println("Elements first occurs at : "+iRet);
		}
	}
}
