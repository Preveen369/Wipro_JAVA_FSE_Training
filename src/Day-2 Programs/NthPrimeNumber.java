import java.util.Scanner;

public class NthPrimeNumber {

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false; 
        }
        return true;
    }

    static int nthPrime(int n) {
        if (n<=0) return -1;
        
        for (int count=0, num=2; ;num++) {
        	if (isPrime(num)) {
        		if (++count == n) {
            		return num;
            	}
        	}
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int result = nthPrime(n);
        System.out.println("The " + n + "th prime number is: " + result);
        sc.close();
    }
}