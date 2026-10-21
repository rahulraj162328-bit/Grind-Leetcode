class Solution {
    public String longestPalindrome(String s) {
        String largest="";
        for(int i=0;i<s.length();i++){
            String even=expandAroundTheCenter(i,i,s);
            String odd=expandAroundTheCenter(i,i+1,s);
            String tempMax=even.length()>odd.length()?even:odd;
            largest=tempMax.length()>largest.length()?tempMax:largest;
        }
        return largest;
    }
    public static String expandAroundTheCenter(int start,int end,String s){
        while(start>=0 && end<s.length() && s.charAt(start)==s.charAt(end)){
            
                start--;
                end++;
        
        }
        return s.substring(start+1,end);
    }

}