public class PrintOddEvenPV {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		System.out.print("Even Elements : ");
		for(int val : arr) {
			if(val % 2 == 0) {
				System.out.print(val + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("Odd Elements : ");
		for(int val : arr) {
			if(val % 2 != 0) {
				System.out.print(val + " ");
			}
		}
		

	}

}
