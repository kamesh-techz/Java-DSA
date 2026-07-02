import java.util.Scanner;

public class SecondLargestMinValueUIV {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int val : arr) {

            if(val > largest) {
                secondLargest = largest;
                largest = val;
            }
            else if(val > secondLargest && val != largest) {
                secondLargest = val;
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + secondLargest);

        sc.close();
    }
}