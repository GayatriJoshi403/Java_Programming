//Accept one number and check whether is divisible by 5 or not

import java.lang.*;
import java.util.*;

class Number
{
	public boolean Divide(int iNo)
	{
		if(iNo%5==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}
class DivisibleBy5
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number");
		int iValue=sobj.nextInt();
		
		Number nobj=new Number();
		
		boolean bRet=nobj.Divide(iValue);
		
		if(bRet==true)
		{
			System.out.println("Number is divisible by 5");
		}
		else
		{
			System.out.println("Number is not divisible by 5");
		}		
	}
}
