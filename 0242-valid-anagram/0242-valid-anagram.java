class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        char[] Array= s.toCharArray();
        char[] arr= t. toCharArray();
        Arrays.sort(Array);
        Arrays.sort(arr);
        if(Arrays.equals(Array, arr)){
            return true;
        }
        return false;
    }
}