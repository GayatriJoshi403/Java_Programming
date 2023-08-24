//find maximum number from array

import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static int Maximum(int Arr[])
	{
		int iCnt=0,iMax=Arr[0];
		
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]>iMax)
			{
				iMax=Arr[iCnt];
			}
		}
		return iMax;
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
		iRet=Maximum(Brr);
		
		System.out.println("Maximum number is : "+iRet);
	}
}
