package Learning_basic_Algorithm_Java;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,77,88,101,234,312};
		int item = 5;
		boolean found = false;
		
		int low=0, high= arr.length, mid;
		
		while(low<=high) {
			
			mid = (low+high)/2;
			
			if(item==arr[mid]) {
				found = true;
				break;
			}else if(item < arr[mid]) {
				high = mid-1;
			}else {
				low = mid + 1;
			}
			
		}
		
		if(found) {
			System.out.println("Item found");
		}else {
			System.out.println("Item not found");
		}
		
		
	}

}
