//Display even numbers from array

import java.lang.*;
import java.util.*;

class NumberProblem
{	
	public static void DisplayEven(int Arr[])
	{
		int iCnt=0;
		
		System.out.println("Even numbers are");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			if(Arr[iCnt]%2==0)
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
	public static void main(String arg[])
	{
		int Brr[];
		int iCnt=0,iSize=0;
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		iSize=sobj.nextInt();
		
		Brr=new int[iSize];
		
		System.out.println("Enter the elements");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}
		DisplayEven(Brr);
	}	
	
}
