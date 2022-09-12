class Solution {
    public int[] searchRange(int[] nums, int target){
       //  public int first(int[] nums, int target){
        int s =0 ;
        int e = n-1;
       // int mid = s+(e-s)/2;
               private int findFirst(int[] nums, int target , int start , int end){
        int ans=-1;
             
             while(s<=e){
                 int mid = s+(e-s)/2;
                 if(nums[mid]==target){
                     ans = mid;
                 }
                 else if(nums[mid]>target){
                     end =  mid-1;
                 }
                 else if(nums[mid]<target){
                     start = mid+1;
                 }
             }
             return ans;
         }
        private int last(int[] nums, int target, int start , int end){
            
            int ans=-1;
             
             while(s<=e){
                 int mid = s+(e-s)/2;
                 if(nums[mid]==target){
                     ans = mid;
                 }
                 else if(nums[mid]>target){
                     end =  mid-1;
                 }
                 else if(nums[mid]<target){
                     start = mid+1;
                 }
             }
             return ans;
         } 
            
    } 
        
        
    }
