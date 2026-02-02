class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] cnt= new int[2];
        for(int i=0; i<students.length; i++){
            cnt[students[i]]++;
        }
        int res=sandwiches.length;
        for(int i=0; i<sandwiches.length; i++){
            int type=sandwiches[i];
            if(cnt[type]==0){
                break;
            }
            cnt[type]--;
            res--;
        }
        return res;
    }
}