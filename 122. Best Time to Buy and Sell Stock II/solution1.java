class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1)
            return 0;
        
        int profit = 0; 
        int start = 0;
        
        for (int i = 0; i < (prices.length - 1); i++) {
            if (prices[i+1] < prices[i]) {
                profit += prices[i] - prices[start]; 
                start = i + 1;
            }
        }
        
        int diff = prices[prices.length-1] - prices[start];
        profit += diff > 0? diff : 0;
            
        return profit;
    }
}