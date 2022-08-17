//Program to divide two numbers

import java.lang.*;
import java.util.*;

class Divide
{
	public int Division(int iNo1,int iNo2)
	{
		if(iNo2<0)
		{
			return -1;
		}
		int iAns=iNo1/iNo2;
		return iAns;
	}
}
class DivideNo
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first number ");
		int iValue1=sobj.nextInt();		
		
		System.out.println("Enter second number ");
		int iValue2=sobj.nextInt();
		
		Divide dobj=new Divide();
		
		int iRet=dobj.Division(iValue1,iValue2);

		System.out.println("Division is : "+ iRet);		
			
	}
}
