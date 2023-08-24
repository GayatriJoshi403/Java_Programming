//find frequency of given number in array

import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static int Frequency(int Arr[],int iNo)
	{
		int iCnt=0,iFrequency=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]==iNo)
			{
				iFrequency++;
			}
		}
		return iFrequency;
	}
	public static void main(String arg[])
	{
		int Brr[];
		int iSize=0,iRet=0,iCnt=0,iValue=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements ");
		iSize=sobj.nextInt();
		
		Brr=new int[iSize];
		
		System.out.println("Enter elements in array :");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}
		System.out.println("Enter number to count frequency");
		iValue=sobj.nextInt();
		
		iRet=Frequency(Brr,iValue);

		System.out.println("Frequency of given number is : "+ iRet);
	}
}
