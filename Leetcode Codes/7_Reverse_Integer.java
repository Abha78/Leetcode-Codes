class Solution {
    public int reverse(int x) {
        long a =0 ;
        int r;
        while(x!=0){
            r = x%10;
            a = (a*10)+r;
            x=x/10;
        }
        if(a<Integer.MAX_VALUE && a > Integer.MIN_VALUE){
            return (int) a;
        }
        else{
            return 0;
        }
        
    }
}