class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res= new StringBuilder();
        int cnt=0;
        for(int i=0; i<s.length(); i++){
            char currentChar=s.charAt(i);
            if(currentChar=='('){
                if(cnt>0){
                    res.append(currentChar);
                }
                cnt++;
            }
                else{
                    cnt--;
                    if(cnt>0){
                        res.append(currentChar);
                    }
                }
            }
        return res.toString();
    }
}