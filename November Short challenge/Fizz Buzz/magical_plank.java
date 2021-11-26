/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class magical_plank
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int t=input.nextInt();
		while(t-->0)
		{
		    int n =input.nextInt();
		    String s=input.next();
		    Double count=0.0;
		    for(int i=1;i<n;i++)
		    {
		        if(s.charAt(i-1)!=s.charAt(i))
		        {
		            count=count+0.5;
		        }
		        
		      
		    }
		    System.out.println((int)Math.round(count));
		    
		    
		    
		}
	}
}
