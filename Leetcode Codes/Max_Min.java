class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //code here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum =0 ;
        for(int i = 0 ; i<N ; i++){
            if(A[i] < min){
                min = A[i];
            }
            
        }
        for(int i =0 ; i<N ; i++){
            if(A[i]> max){
                max = A[i];
            }
        }
        for(int i =0 ; i<N; i++){
            sum = min + max;
        }
        return sum ;
    }
}
