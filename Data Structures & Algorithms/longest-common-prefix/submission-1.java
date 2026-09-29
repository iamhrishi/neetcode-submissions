class Solution {


    public String longestCommonPrefix(String[] strs) {
        
        int minLength = strs[0].length();
        for(String str : strs){
            minLength = Math.min(minLength, str.length());
        }

        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            boolean isCommon = true;
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(i) != strs[0].charAt(i)){
                    isCommon = false;
                    break;
                }
            }
            if(isCommon)
                prefix.append(strs[0].charAt(i));
            else
                break;
        }
        return prefix.toString();
    }
}