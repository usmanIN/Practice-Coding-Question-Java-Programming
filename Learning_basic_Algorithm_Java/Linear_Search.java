package Learning_basic_Algorithm_Java;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,77,88,101,234,312};
		int item = 301;
		boolean found = false;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				found = true;
				break;
			}
		}
		
		if(found) {
			System.out.println("Item found");
		}else {
			System.out.println("Item not found");
		}
		
		
	}

}
