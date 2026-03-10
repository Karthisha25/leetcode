import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length() > s2.length()) return false;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        // build frequency map for s1
        for(int i = 0; i < s1.length(); i++){
            char c = s1.charAt(i);

            if(map1.containsKey(c)){
                map1.put(c, map1.get(c) + 1);
            }else{
                map1.put(c, 1);
            }
        }

        int l = 0;

        for(int r = 0; r < s2.length(); r++){

            char c = s2.charAt(r);

            if(map2.containsKey(c)){
                map2.put(c, map2.get(c) + 1);
            }else{
                map2.put(c, 1);
            }

            // if window size exceeds s1 length
            if(r - l + 1 > s1.length()){

                char left = s2.charAt(l);
                map2.put(left, map2.get(left) - 1);

                if(map2.get(left) == 0){
                    map2.remove(left);
                }

                l++;
            }

            if(map1.equals(map2)){
                return true;
            }
        }

        return false;
    }
}