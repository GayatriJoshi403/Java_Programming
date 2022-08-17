//Accept one number from user and print that number of * on screen.

import java.lang.*;
import java.util.*;

class DisplayStar
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number to display * : ");
		int iValue=sobj.nextInt();
		
		for(int i=1;i<=iValue;i++)
		{
			System.out.println("*");
		}
		
	} 
}
