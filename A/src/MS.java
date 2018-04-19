
public class MS {
	public static void main(String args[]) {
		int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println("Maximum value is "+maxSubarray(arr));
	}
	
	private static int maxSubarray(int arr[]) {
		if (arr == null || arr.length <= 0 )
			return 0;
		int currSum = arr[0], maxSum = arr[0];
		
		for(int i=1; i < arr.length; i++) {
			currSum = Integer.max(arr[i], currSum + arr[i]);
			maxSum = Integer.max(currSum, maxSum);
		}
		return maxSum;
	}

}
