//find given number from array using flag

import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static boolean Search(int Arr[],int iNo)
	{
		int iCnt=0;
		boolean flag=false;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				flag=true;
				break;
			}
		}
		
		return flag;
		
	}
	public static void main(String arg[])
	{
		int Brr[];
		int iSize=0,iCnt=0,iValue=0;
		boolean bRet=false;
		
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		iSize=sobj.nextInt();
		
		Brr=new int[iSize];
		
		System.out.println("Enter elements in array :");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}
		System.out.println("Enter element to search");
		iValue=sobj.nextInt();
		
		bRet=Search(Brr,iValue);
		
		if(bRet==true)
		{
			System.out.println("Element is present in array ");
		}
		else
		{
			System.out.println("Element is not present in array ");
		}
	}
}
