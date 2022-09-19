class Solution {
    public String removeOccurrences(String s, String part) {
        
        int L = part.length();
        while(L>0){
            int index = s.indexOf(part);
            if(index>-1){
                
                //Doubt in this Line
                s = s.substring(0,index)+s.substring(index+L);
                
            }
            else{
                break;
            }
            
        }
        return s;
        
    }
}