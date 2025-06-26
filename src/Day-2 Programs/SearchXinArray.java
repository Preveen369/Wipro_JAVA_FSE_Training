import java.util.Scanner;

public class SearchXinArray {
	
	static boolean find_val_X(int[] arr, int low, int high, int X) {
		if (low > high) return false;
		
		int mid = low + (high - low + 1)/2;
		if (arr[mid] == X) {
			return true;
		} else if (arr[mid] > X) {
			return find_val_X(arr, low, mid-1, X);
		} else {
			return find_val_X(arr, mid+1, high, X);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] nums = new int[size];
		
 		System.out.print("Enter array elements: ");
		for (int i=0; i<size; i++) {
			nums[i] = sc.nextInt();
		}
		
		System.out.print("Enter element X to search: ");
		int X = sc.nextInt();
		boolean value_found = find_val_X(nums, 0, nums.length-1, X);
		if (value_found)
			System.out.print("Element " + X + " present in array");
		else
			System.out.print("Element " + X + " not present in array");
		sc.close();

	}

}
