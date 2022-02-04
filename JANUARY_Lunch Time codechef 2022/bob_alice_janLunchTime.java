package hello;
import java.util.*;
public class bob_alice_janLunchTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.println("hfhuaehsdfkhlsa");
		int t=input.nextInt();
		while(t-->0)
		{
			for(int i=0;i<t;i++)
			{
				
					int x=input.nextInt();
					int y=input.nextInt();
					int z=input.nextInt();
					
					
					if((x+y==z)||(y+z==x)||(x+z==y ))
					{
						
						System.out.println("YES");
					}
					else
					{
						System.out.println("NO");
					}
				
				
			}
		}
		
		
		

	}

}
