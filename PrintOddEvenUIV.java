import java.util.*;
public class PrintOddEvenUIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.print("Enter Array Elements : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.print("Even Elements : ");
		for(int val : arr) {
			if(val % 2 ==0) {
				System.out.print(val + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Odd Elments : ");
		for(int val : arr) {
			if(val % 2 !=0 ) {
				System.out.print(val + " ");
			}
		}
		sc.close();
	}

}
