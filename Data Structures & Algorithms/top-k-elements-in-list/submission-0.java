class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int[] ans = new int[k];

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            else{
                map.put(num, 0);
            }
        }

        List<Map.Entry<Integer, Integer>> count = new ArrayList<>(map.entrySet());

        count.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());

        for(int i = 0; i < k; i++){
            ans[i] = count.get(i).getKey();
        }

        return ans;

    }
}
