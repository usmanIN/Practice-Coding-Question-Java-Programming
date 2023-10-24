package ArrayQuestion;

public class buySaleStock {
	
public static int maxProfit(int[] prices) {
        
        int profit = 0;
        
        //Normal Souiton 0(N2) failed on TLE
//        for(int i=0; i<prices.length; i++)
//        {   
//            for(int j=i+1; j<prices.length;j++)
//            {	
//                if(prices[i] < prices[j]){
//                    profit = Math.max(profit, prices[j]-prices[i]);
//                }                
//            }
//        }
//        
        //Optimal Solution
        int min = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++)
        {
        	min= Math.min(prices[i], min);
        	profit = Math.max(profit, prices[i]-min);
        }
        
        
       return profit;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,1,5,3,6,4};
		
		int result = maxProfit(arr);
		
		System.out.println(result);
	}

}
