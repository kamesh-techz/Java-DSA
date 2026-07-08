package Strings;

public class ReverseStringUsingTwoPointer {

	public static void main(String[] args) {
		
		char arr[] = {'k','a','m','e','s','h'};
		
		int left = 0;
		int right = arr.length - 1;
		
		while(left < right) {
			
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		System.out.println("Reversed String : ");
		 
		for(char ch : arr) {
			System.out.print(ch);
		}
	}

}
