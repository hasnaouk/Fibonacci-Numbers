import java.util.Scanner;

public class FibonacciNumbers {
	
	// method that gives the (n + 1)th Fibonacci Number(index n)
	public static long FibNum(long n) {		
		if (n==0) // base case
			return 0;
		else if (n==1) // base case
			return 1;
		else
			return FibNum(n-2) + FibNum(n-1); // reduction and recursive calls
	}

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);		
		// enter an index for the Fibonacci Number		
		System.out.print("Enter an index for the Fibonacci number: ");
		 int index = input.nextInt();
		
		 // find and display the Fibonacci number
		 System.out.println("The Fibonacci number at index " + index + " is " + FibNum(index));
		
	}

}
