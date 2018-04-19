
public class LISA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5, 6, 3, 5, 7, 8, 9, 1, 2};
		System.out.println("Length = " + LongestIncreasingSubarray(arr));
	}
	
	private static int LongestIncreasingSubarray(int arr[]) {
		if (arr == null || arr.length <= 0 )
			return 0;
		int len = 1, max_len = 1;
		
		for(int i=1; i < arr.length; i++) {
			if(arr[i] > arr[i-1]) {
				len++;
			} else {
				len = 1;
			}
			max_len = Integer.max(len, max_len);
		}
		return max_len;
	}

}
