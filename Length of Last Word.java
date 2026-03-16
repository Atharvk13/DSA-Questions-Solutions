// Length of Last Word

class Solution {
    public int lengthOfLastWord(String s) 
    {
        String s1=s.trim();
        int length=0,i=s1.length()-1;
        while( i!=-1 && s1.charAt(i)!=' ')
        {
            length++;
            i--;
        }
        return length;   
    }
}