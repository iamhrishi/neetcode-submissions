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

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        for(int num : map.keySet()){
            minHeap.offer(num);
            if(minHeap.size() > k){
                minHeap.poll();
            }
        }
        //Step 5 : add the elements till k, basically we are iterating from 0 to k on a list and adding it in array
        for(int i = 0; i < k; i++){
            ans[i] = minHeap.poll();
        }

        return ans;
    }
}
