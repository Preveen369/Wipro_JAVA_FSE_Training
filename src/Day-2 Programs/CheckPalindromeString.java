public class CheckPalindromeString {
	
	private static boolean checkPalindrome(String str, int i, int j){
        if (i > j) return true;
        if (str.charAt(i) == str.charAt(j)){
            return checkPalindrome(str, i+1, j-1);
        } else{
            return false;
        }
    }

    public static void main(String[] args){
        String input = "madame";
        boolean result = checkPalindrome(input, 0, input.length()-1);
        System.out.println(result);
    }

}
