package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Type the number up to which you want to find all prime numbers :");
		int n = in.nextInt();
		int[] numbers = new int[n+1];
		for (int i = 0; i < n+1; i++)
		{
			numbers[i] = i;
		}
		
		for (int p=2; p*p<n; p++)
		{
			for (int k = 2*p; k<n+1; k+=p)
			{
				numbers[k] = 0;
			}
		}
		
		/**int p = 2;
			for (int k = 2; k*p <= n; k++)
			{
				for (int i = 0; i < n-1; i++)
				{
					if (numbers[i] == k*p)
						numbers[i]=0;
				}
			p++;
			}
			*/
			
		
		System.out.print("Prime numbers between 2 and " + n + " are ");
		for(int val: numbers)
		{
				if(val!=0 && val!=1)
				{
					System.out.print(val +", ");
				}
				
		}
		

	}

}
