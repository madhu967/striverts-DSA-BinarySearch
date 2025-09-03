class Solution {
    public static int maxEle(int[] piles){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<piles.length;i++){
            max=Math.max(piles[i],max);
        }
        return max;
    }
    public static int totalhours(int[] piles,int hours){
        int totalhours=0;
        for(int i=0;i<piles.length;i++){
            totalhours+=Math.ceil((double)piles[i]/(double)hours);
        }
        return totalhours;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0,high=maxEle(piles);
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(totalhours(piles,mid)<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return ans;
    }
}
