public class RemoveChars {
	
	private static String removeXChars(String str) {
		if (str.length() == 0){
			return "";
	  	}
	  	if (str.charAt(0) == 'x'){
	  		return removeXChars(str.substring(1));
	  	}
		return str.charAt(0) + removeXChars(str.substring(1));
	}
	
//	private static String removeXChars(String str) {
//		StringBuilder sb = new StringBuilder("");
//		for (char ch : str.toCharArray()) {
//			if (ch != 'x') {
//				sb.append(ch);
//			}
//		}
//		return sb.toString();
//	}

	public static void main(String[] args) {
		String input = "xxab";
		String resultStr = removeXChars(input);
		System.out.println(resultStr);
	}

}
