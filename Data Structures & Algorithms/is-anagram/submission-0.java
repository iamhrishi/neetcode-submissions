class Solution {

    public int[] code(String u){
        int[] freq = new int[26];
        for(char ch : u.toCharArray()){
            freq[ch - 'a']++;
        }
        return freq;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        return Arrays.equals(code(s), code(t));
    }
}
