package Lab;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int i=0;
		int num=0;
		String primeNumbers= "";
		System.out.println("enter the value of n");
		int n= s.nextInt();
		s.close();
		for(i =1;i<=n;i++)
		{
			int counter=0;
			for(num=i;num>=1;num--)
			{
				if(i%num==0)
				{
				 counter=counter+1;
				}
			}
			if (counter==2)
			{
				primeNumbers = primeNumbers + i + " ";
			}
				}
		System.out.println("prime numbers from 1 to n are");
		System.out.println(primeNumbers);
		}
}
