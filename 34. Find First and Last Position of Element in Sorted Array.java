class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first=first(nums,target);
        if(first == -1) return new int[]{-1,-1};
        int last=last(nums,target);
        return new int[]{first,last};
    }
    public int first(int[] nums,int target){
        int low=0,high=nums.length-1;
        int first=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
               first=mid;
               high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
        public int last(int[] nums,int target){
        int low=0,high=nums.length-1;
        int last=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
               last=mid;
               low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
        }
    }

