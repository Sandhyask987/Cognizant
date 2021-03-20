package Lab;

import java.util.Scanner;

public class Traffic {
	private static Scanner s;
	
	public static void main(String[] args) {
	 System.out.println("enter choice : 1 for red 2 for yellow 3 for green ");
	 s = new Scanner (System.in);
		int choice = s.nextInt();
		switch (choice)
		{
		case 1:	
			System.out.println("stop");
		    break;
		case 2:
			System.out.println("ready");
			break;
		case 3:
			System.out.println("go");
			break;
			default:
				System.out.println("invalid choice");
			
	}

	}

}
