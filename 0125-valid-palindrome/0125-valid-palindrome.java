class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();   
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        boolean t=false;
        StringBuilder org= new StringBuilder(s);
        org.reverse();
        if(s.equals(org.toString())){
            t=true;
        }
        if(t){
            return true;
        }
        else{
            return false;
        }

    }
}