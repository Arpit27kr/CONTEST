/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class can_you_eat
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
	
		while(t-->0)
		{
		    	int n=input.nextInt();
		    	int k=input.nextInt();
		    	if(n%k==0)
		    	{
		    	    System.out.println(k);
		    	}
		    	else{
		    	    System.out.println("-1");
		    	}
		    
		}
	}
}
