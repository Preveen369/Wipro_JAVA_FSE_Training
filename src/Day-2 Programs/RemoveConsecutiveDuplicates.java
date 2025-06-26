public class RemoveConsecutiveDuplicates {	
	
	static String removeConsecutiveDuplicates(String str) {
		if (str.length() <= 1) return str;
		
		if (str.charAt(0) == str.charAt(1)){
	        return removeConsecutiveDuplicates(str.substring(1));
	    } else{
	    	return str.charAt(0) + removeConsecutiveDuplicates(str.substring(1));
	    }
	}
	
//	static String removeConsecutiveDuplicates(String str) {
//		if (str.length() <= 1) return str;
//		
//		StringBuilder sb = new StringBuilder("");
//		char prevChar = str.charAt(0);
//		sb.append(prevChar);
//
//		for (int i=1; i<str.length(); i++){
//			char currChar = str.charAt(i);
//			if (currChar != prevChar){
//				sb.append(currChar);
//				prevChar = currChar;
//			}	
//		}
//
//		return sb.toString();
//	}

	public static void main(String[] args) {
		String input = "aabccba";
		String resultString = removeConsecutiveDuplicates(input);
		System.out.println(resultString);
	}

}