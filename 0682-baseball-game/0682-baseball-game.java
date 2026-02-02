class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0; i<operations.length; i++){
            String s= operations[i];
            int n=ar.size();
            if(s.equals("+")){
                ar.add(ar.get(n-1)+ar.get(n-2));
            }
            else if(s.equals("C")){
                ar.remove(n-1);
            }
            else if(s.equals("D")){
                ar.add(ar.get(n-1)*2);
            }
            else{
                ar.add(Integer.parseInt(s));
            }
        }
        int ans=0;
        for(int i=0; i<ar.size(); i++){
            ans+=ar.get(i);
        }
        return ans;
    }
}