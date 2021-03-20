package Lab;

public class CalNaturalSum {
	static int calculateSum( int N )  
	{  
	    int S1, S2, S3,sum=0;  
	  
	    S1 = ((N / 3)) * (2 * 3 + (N / 3 - 1) * 3) / 2;  
	    S2 = ((N / 5)) * (2 * 5 + (N / 5 - 1) * 5) / 2;  
	    S3 = ((N / 15)) * (2 * 15 + (N / 15 - 1) * 15) / 2;  
	  
	    return sum = S1 + S2 - S3;  
	}  
	  
	 public static void main (String[] args) { 
	    System.out.print("sum of natural numbers which are divisible by 3 or 5 is  : " +calculateSum(20));  
     }

}
