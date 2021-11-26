/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class can_reach
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int x =input.nextInt();
		    int y =input.nextInt();
		    int k =input.nextInt();
		    if(x%k==0 && y%k==0)
		    {
		        System.out.println("YES");
		        
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		
		
		
	}
}
