import java.util.Scanner;

public class Sum_Of_DigitNums {
	
	static int sumOfDigits(int num) {
		if (num == 0) 
			return 0;
		
		return (num % 10) + sumOfDigits(num / 10);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int N = sc.nextInt();
		System.out.print("The sum of digits in num : " + sumOfDigits(N));
		sc.close();
	}

}
