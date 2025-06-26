public class Geometric_Sum {
	
	private static double geometric_sum(int k) {
	    if (k==0) return 1;
	    return Math.pow(0.5, k) + geometric_sum(k-1);
	}
	
//	private static double geometric_sum(double k) {
//  	  return (1 * (1 - Math.pow(0.5, k+1))) / (1 - 0.5);
//	}

	public static void main(String[] args) {
		int inputTerm = 4;
		double result = geometric_sum(inputTerm);
		System.out.println(result);
	}

}
