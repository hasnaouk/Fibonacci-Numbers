import java.util.Scanner;

public class FibonacciNumbers {
	
	// 1st method that gives the (n + 1)th Fibonacci Number(index n)
	public static long FibNum(long n) {		
		if (n==0) // base case
			return 0;
		else if (n==1) // base case
			return 1;
		else
			return FibNum(n-2) + FibNum(n-1); // reduction and recursive calls
	}
	
	// 2nd method
	public static long Fib(long n) {
		long Fib0=0; //for Fib(0)
		long Fib1=1; //for Fib(1)
		long Fib2=1; //for Fib(2)
		
		if(n==0)
			return Fib0;
		else if(n==1)
			return Fib1;
		else if(n==2)
			return Fib2;
		
		for(int i=3; i<=n; i++) {
			Fib0=Fib1;
			Fib1=Fib2;
			Fib2=Fib0+Fib1;
		}
		return Fib2;
	}

	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);		
		// enter an index for the Fibonacci Number		
		System.out.print("Enter an index for the Fibonacci number: ");
		 int index = input.nextInt();
		
		 // find and display the Fibonacci number
		 System.out.println("1st Method:\nThe Fibonacci number at index " + index + " is " + FibNum(index));
		 System.out.println("2nd Method:\nThe Fibonacci number at index " + index + " is " + FibNum(index));
		
	}
}
