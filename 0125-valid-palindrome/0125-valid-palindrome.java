class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "");
        clean= clean.toLowerCase();
        String s2= "";
        for(int i=clean.length()-1; i>=0; i--){
            s2= s2+clean.charAt(i);
        }
        if(clean.equals(s2)){
            return true;
        }
        return false;
    }
}