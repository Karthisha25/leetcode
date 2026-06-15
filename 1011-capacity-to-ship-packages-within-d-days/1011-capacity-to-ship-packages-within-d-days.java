class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length; i++){
            low=Math.max(weights[i],low);
            high+=weights[i];
        }int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            int daysused=1;
            int currload=0;
            for(int i=0; i<weights.length; i++){
                if(currload+weights[i]>mid){
                    daysused++;
                    currload=weights[i];
                }
                else{
                    currload+=weights[i];
                }
            }
            if(daysused<=days){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}