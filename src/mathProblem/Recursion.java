package mathProblem;

public class Recursion {
	public static void main(String[]args) {
	System.out.println("The Factorial variable is :" + factorial(6));	
	}
    
	public static int factorial(int n) {
		if (n == 0) {
			return 1;	
		}
		else {
			return n * factorial(n-1);
		}
	}
}



