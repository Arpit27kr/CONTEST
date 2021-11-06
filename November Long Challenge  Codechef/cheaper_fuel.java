/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		int x=input.nextInt();
		int y=input.nextInt();
		int a=input.nextInt();
		int b=input.nextInt();
		int k=input.nextInt();
		
		for(int i=0;i<k;i++)
		{
		    x=x+a;
		    y=y+b;
		}
		    if(x>y)
		    {
		        System.out.println("DIESEL");
		    }
		    else if(y>x)
		    {
		         System.out.println("PETROL");
		    }
		    else{
		         System.out.println("SAME PRICE");
		    }
	
		 
		}
	}
	
}
