package hello;

import java.util.Scanner;

public class Weird_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
	int t=input.nextInt();
	while(t-->0)
	{
		int c=0;
		int n=input.nextInt();
		for(int i=0;i<n;i++)
		{
			int x=input.nextInt();
			if(x%2==1)
			{
				c++;
			}
		}
		if(c%2==1)
		{
			c=c-1;
		}
		else
		{
			System.out.println(c/2);
		}
	}

}
}