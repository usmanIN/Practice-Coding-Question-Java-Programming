package Learning_basic_Algorithm_Java;

public class Jump_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,4,5,77,88,101,234,312};
		int item = 51;
		boolean found = false;
		int n = arr.length , i = 0;
		int m = (int) Math.sqrt(n);
		
		
		while(arr[i]<= item && m <n) {
			i = m;
			m += (int) Math.sqrt(n);
			if(m > n - 1) {
				break;
			} 
		}
		
		for(int j=i; j<m; j++) {
			if(arr[j]== item) {
				found= true;
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
