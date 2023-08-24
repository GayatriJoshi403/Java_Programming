//count even numbers from array

import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static int CountEven(int Arr[])
	{
		int iCnt=0,iEvenCnt=0;
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2==0)
			{
				iEvenCnt++;
			}
		}
		return iEvenCnt;
	}
	public static void main(String arg[])
	{
		int Brr[];
		int iSize=0,iCnt=0,iRet=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements :");
		iSize=sobj.nextInt();
		
		Brr=new int[iSize];
		
		System.out.println("Enter elements in array :");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}
		
		iRet=CountEven(Brr);

		System.out.println("Total number of even elements are : "+iRet);

	}
}
