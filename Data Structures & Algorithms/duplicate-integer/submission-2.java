class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.getOrDefault(num, 0)+ 1);
            }
            else
                map.put(num, 0);
        }

        for(Map.Entry<Integer, Integer> count : map.entrySet()){
            if(count.getValue() != 0){
                return true;
            }
        }
        return false;
    }
}