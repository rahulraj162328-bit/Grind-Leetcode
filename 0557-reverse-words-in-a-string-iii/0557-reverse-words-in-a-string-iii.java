class Solution {
    public String reverseWords(String s) {
        String str="",word="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!=' ')
                str=c+str;
            else{
                if(str.length()!=0)
                    word=word+" "+str;
                    str="";
            }
           
        }
         return (word+" "+str).strip();
    }
}