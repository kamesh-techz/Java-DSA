import java.util.Scanner;
public class ReverseArrayUIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size:");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.print("Enter array elements:");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int left = 0;
		int right = arr.length-1;
		
		while(left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			
			left++;
			right--;
		}
		System.out.println("Reversed array:");
		
		for(int val : arr) {
			System.out.print(val + " ");
		}
		
		sc.close();
		

	}

}
