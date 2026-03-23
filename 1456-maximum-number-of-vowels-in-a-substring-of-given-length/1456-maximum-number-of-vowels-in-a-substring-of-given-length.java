class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int vc=0;
        int maxi=0;
        for(int r=0;r<s.length();r++){
            if(isVowel(s.charAt(r))){
                vc++;
            }
            if(r-l+1==k){
                maxi=Math.max(maxi,vc);
                if(isVowel(s.charAt(l))){
                    vc--;
                }
                l++;
            }
        }
        return maxi;
    }
    public boolean isVowel(char c){
        return c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u';
    }
}