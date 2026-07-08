class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        List<Integer>[] freq = new List[nums.length + 1];

        for(int num : nums){
            freqMap.put(num, freqMap.getOrDefault(num, 0)+ 1);
        }

        for(int key : freqMap.keySet()){
            int frequency = freqMap.get(key);
            if(freq[frequency] == null){
                freq[frequency] = new ArrayList<>();
            }
            freq[frequency].add(key);
        }

        int res[] = new int[k];
        int index = 0;
        for(int i = freq.length - 1; i >= 0; i--){
            if(freq[i] != null){
                for(int f : freq[i]){
                    res[index++] = f;
                    if(index == k)
                        return res;
                }
                    
            } 
        }
        return res;
    }
}
