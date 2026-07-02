import java.util.*;
public class SecondLargestUIV {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter Array Elements : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

        int max1, max2;

        if(arr[0] > arr[1]) {
            max1 = arr[0];
            max2 = arr[1];
        } else {
            max1 = arr[1];
            max2 = arr[0];
        }

        for(int i = 2; i < arr.length; i++) {

            if(arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && arr[i] != max1) {
                max2 = arr[i];
            }
        }

        System.out.println("Largest Element: " + max1);
        System.out.println("Second Largest Element: " + max2);

        sc.close();
	}

}
