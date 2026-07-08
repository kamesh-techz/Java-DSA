package Strings;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String str = "Good Bad Ugly";
		StringBuilder reverse = new StringBuilder();
		
		for(int i = str.length() - 1; i >= 0; i-- ) {
			reverse.append(str.charAt(i));
		}
		System.out.println("Original String : " + str);
		System.out.println("Reversed String : " + reverse);
		
	}

}
