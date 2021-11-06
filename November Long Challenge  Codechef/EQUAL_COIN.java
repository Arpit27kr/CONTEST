

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
Scanner input=new Scanner(System.in);
		int t=input.nextInt();
	
		while(t-->0)
		{
			int x=input.nextInt();
			int y=input.nextInt();
			int total=x*1+y*2;
			
			if(x%2==0)
			{
			    if(x==0 && y%2==0)
			    {
			        System.out.println("YES");
			        
			    }
			    else if(x==0 && y%2!=0)
			    {
			        System.out.println("NO");
			    }
			    else{
			        System.out.println("YES");
			    }
			    
			
			}
			else{
			    System.out.println("NO");
			}
		}
	}
}
