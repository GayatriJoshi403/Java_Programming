import java.lang.*;
import java.util.*;

class NumberProblem
{
	public static void Display(int Arr[])
	{
		int iCnt=0;
		
		System.out.println("ELements in array are ");
		for(iCnt=0;iCnt<Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
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
		
		System.out.println("Enter element in array ");
		for(iCnt=0;iCnt<iSize;iCnt++)
		{
			Brr[iCnt]=sobj.nextInt();
		}

		Display(Brr);
	}
}

