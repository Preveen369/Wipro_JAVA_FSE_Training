public class NumberOfZeroes {
	
	private static int numberOfZeroes(int num) {
  		if (num==0) return 1;
  		return countZeroes(num);
  	}
  	
  	private static int countZeroes(int num){
  		if (num == 0) return 0;
  		int last_digit = num % 10;
  		return (last_digit == 0 ? 1 : 0) + countZeroes(num / 10);
  	}
	
//	private static int numberOfZeroes(int num) {
//		if (num == 0) return 1;
//		int zeroes = 0;
//		while (num != 0) {
//			int digit = num % 10;
//			if (digit == 0) zeroes++;
//			num = num / 10;
//		}
//		return zeroes;
//	}

	public static void main(String[] args) {
		int num = 1002002;
		int result = numberOfZeroes(num);
		System.out.println(result);
	}

}
