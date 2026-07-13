class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        int n = nums.length;
        int maxCount = 0;

        for(int num : nums){
            int curr = num;
            int count = 0;
            while(set.contains(curr)){
                count++;
                curr++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }    
}
