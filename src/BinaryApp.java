import java.util.Arrays;

public class BinaryApp {
	public static void main(String[] args) {
		
		int[] array = {3123, 12, 4, 145, 88, 9894, 0, -8};
		Arrays.sort(array);
		int key = 88;
		int last = array.length -1;
		int result = binarySearch(array, 0, last, key);
		if(result < 0) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element index = " + result);
		}
		
	}
	
	public static int binarySearch(int[] arr, int first, int last, int key) {
		if(last >= first) {
			int mid = first + (last - first) / 2;
			if(arr[mid] == key) {
				return mid;
			}
			if(arr[mid] > key) {
				return binarySearch(arr, first, mid-1, key);
			} 
			return binarySearch(arr, mid+1, last, key);
		}
		
		return -1;
	}
}

