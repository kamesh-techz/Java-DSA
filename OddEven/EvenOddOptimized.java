public class EvenOddOptimized {

	public static void main(String[] args) {
		  int arr[] = {10, 15, 20, 25, 30, 35};

	        int evenCount = 0;
	        int oddCount = 0;

	        String even = "";
	        String odd = "";

	        for(int val : arr) {

	            if(val % 2 == 0) {
	                evenCount++;
	                even += val + " ";
	            } else {
	                oddCount++;
	                odd += val + " ";
	            }
	        }

	        System.out.println("Even Elements: " + even);
	        System.out.println("Even Count: " + evenCount);

	        System.out.println("Odd Elements: " + odd);
	        System.out.println("Odd Count: " + oddCount);

	}

}
