package mathProblem;

public class Factorial1 {
	
	public static void main(String[]args) {
		// Factorial of 10		
		// using Iteration
		 
		int n = 10;
		int result = 1;
		
		for (int i = 1; i<=n ; i++) {
			result = result * i ;
		}
			System.out.println("The Factorial variable is :"+ result);
			System.out.println("The Factorial is :" + factorial(10));
					
		}

public static int factorial(int n) {
	if (n==0) {
		return 1;	
	}
	else {
		return n * factorial(n-1);
	}

}
}



