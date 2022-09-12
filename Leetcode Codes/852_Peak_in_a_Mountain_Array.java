class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int mid ; 
        int start=0;
        int end = arr.length-1;
        
        while(start < end){
            mid= start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                
                start = mid +1;
            }
            else{
                end = mid;
            }
            mid = start+(end-start)/2;
        }
        return start;
        
    }
}