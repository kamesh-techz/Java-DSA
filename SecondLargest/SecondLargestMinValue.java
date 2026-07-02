public class SecondLargestMinValue {

    public static void main(String[] args) {

        int arr[] = {10, 40, 20, 50, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int val : arr) {

            if(val > largest) {

                secondLargest = largest;
                largest = val;

            } else if(val > secondLargest && val != largest) {

                secondLargest = val;
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + secondLargest);
    }
}