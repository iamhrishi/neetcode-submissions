class Solution {

    private int maxPile(int[] piles){
        int max = piles[0];

        for(int pile : piles){
            max = Math.max(max,pile);
        }
        return max;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0;
        int right = maxPile(piles) - 1;

        int k = left + (right - left) / 2;

        while(left <= right){
            int total = 0;
            for(int p : piles){
                total += Math.ceil((double)p/k);
            }
            if(total <= h){
                right = k - 1;
            }
            else
                left = k + 1;
            
            k = left + (right - left) / 2;
        }
        return k;
    }
}
