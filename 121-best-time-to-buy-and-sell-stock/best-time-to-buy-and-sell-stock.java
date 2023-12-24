 class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int prof = 0;
        int profT = 0;
        
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
            }
            profT = prices[i] - min;
            if(prof < profT){
                prof = profT;
            }
        }
        return prof;
    }
}