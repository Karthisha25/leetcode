class Solution {
    public boolean isSubsequence(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n1>n2){
            return false;
        }
        int i=0;
        int j=0;
        while(i<s.length()&& j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                
            }
            j++;
        }
        return i==s.length();
    }
}