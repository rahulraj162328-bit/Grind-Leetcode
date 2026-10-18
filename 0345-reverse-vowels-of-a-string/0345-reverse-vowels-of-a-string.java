class Solution {
    public String reverseVowels(String s) {
        
        char[] c=s.toCharArray();
        int start=0;
        int end=c.length-1;
        while(start<end){
            if(start<end && !(isVowel(c[start]))){
                start++;                
            }else if(start<end && !(isVowel(c[end]))){
                end--;                
            }
            
            else{
                char x=c[start];
                c[start]=c[end];
                c[end]=x;
                start++;
                end--;
            }


        }
        return new String(c);
            
            

            
        
    }
    private boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}
