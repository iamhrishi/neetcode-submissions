class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //Step 1 : create a HashMap
        HashMap<Integer, Integer> map = new HashMap<>(); 
        
        //Created an ans array to return ans and store the k most elements
        int[] ans = new int[k];

        //Step 2 : add elements(Key) and their counts(Value) in HashMap
        for(int num : nums){
                map.put(num, map.getOrDefault(num, 0) + 1);
        }

        //Step 3 : Convert hash map into list to sort it based on count to the key
        List<Map.Entry<Integer, Integer>> count = new ArrayList<>(map.entrySet());

        //Step 4 : sort descendingly as per Values to fetch k most elements
        count.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());

        //Step 5 : add the elements till k, basically we are iterating from 0 to k on a list and adding it in array
        for(int i = 0; i < k; i++){
            ans[i] = count.get(i).getKey();
        }

        return ans;
    }
}
