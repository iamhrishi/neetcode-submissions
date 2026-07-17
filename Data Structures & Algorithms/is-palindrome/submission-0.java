class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        String st = sb.toString();

        int i = 0;
        int j = st.length() - 1;

        while(i < j){
            if(st.charAt(i) != st.charAt(j))
                return false;
            else{
                i++;
                j--;
            }
        }
    return true;
    }
}
