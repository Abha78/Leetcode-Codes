class Solution {
    public boolean isPalindrome(String s) {
        
       
       
        
        
        s = s.toLowerCase();
        StringBuilder b = new StringBuilder();
        for(int i =0 ; i<s.length() ; i++)
        {  
            if(Character.isDigit(s.charAt(i))||Character.isLetter(s.charAt(i))){
                b.append(s.charAt(i));
            }
        }
         int n = b.length();
        int i =0 ; 
        int j = n-1;
        
        for(i =0 ; i<b.length () ;i++)
        {
            
            if(b.charAt(i)!=b.charAt(j-i)){
                return false;
            }
        }
            i++;
            j--;
        
        return true;
    }
}

        
        










