import java.util.*;
public class CountEvenOdd {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter array elements :");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int evenCount = 0;
		int oddCount = 0;
		
		for(int val : arr) {
			if(val % 2 == 0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
		}
		System.out.println("Even Count = " + evenCount);
		System.out.println("Odd Count = " + oddCount);
		
		sc.close();

	}

}
