package Lab;

import java.util.Scanner;

public class Cube {
	static int t,n=0,sum=0,counter=0;
	public static int SumOfCubes(int n) {
    while(n>0) {
	     int t =n%10;
	     sum =sum+(t*t*t);
	     counter=counter+1;
	      n=n/10;
    }
		return sum;
	}
	    

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("enter  a number to find sum of the cubes");
	int n=sc.nextInt();
    String SumOfCubes;
	System.out.println("sum is ="+SumOfCubes(n));

	}

}
