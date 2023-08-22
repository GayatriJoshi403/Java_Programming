//Input : 5
//output : 5  * 4 *  3 *  2 *  1
//complexity O(N)

import java.lang.*;
import java.util.*;

class DisplayStar
{
	public void Display(int iNo)
	{
		int iCnt=0;
		
		for(iCnt=iNo;iCnt>=1;iCnt--)
		{
			System.out.print(iCnt+"\t"+"*"+"\t");
		}
		System.out.println();
	}
}
class pattern4
{
	public static void main(String arg[])
	{
		int iValue=0;
		Scanner sobj=new Scanner(System.in);
		DisplayStar dobj=new DisplayStar();
		
		System.out.println("Enter the value : ");
		iValue=sobj.nextInt();
		
		dobj.Display(iValue);
	}
}

