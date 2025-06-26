import java.util.Scanner;

public class NthFibonacciNumber {
	
	private static int nthFibo(int n) {
		if (n<=1) {
			return n;
		} else {
			return nthFibo(n-1) + nthFibo(n-2);		
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
		int result = nthFibo(num);
		System.out.println("The " + num + "th Fibonacci number is => " + result);
		sc.close();

	}

}
