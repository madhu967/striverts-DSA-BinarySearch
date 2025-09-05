class Solution {
    public static boolean canWePlace(int[] position,int dist,int m){
        int n=position.length;
        int cntBalls=1;
        int last=position[0];
        for(int i=0;i<n;i++){
            if(position[i]-last>=dist){
                cntBalls++;
                last=position[i];
            }
            if(cntBalls>=m) return true;
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        int n=position.length;
        Arrays.sort(position);

        int low=1,high=position[n-1]-position[0];
        while(low<=high){
            int mid=(high+low)/2;
            if(canWePlace(position,mid,m)==true){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
}
