class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int minBuy = prices[0];

        for(int i = 0; i < prices.length; i++){
            int buy = prices[i];
            if(minBuy > buy){
                minBuy = buy;
            }
            else
                max = Math.max(max, prices[i] - minBuy);
        }
        return max;
    }
}
