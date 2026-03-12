// Reverse Vowels of a String

class Solution {
    public String reverseVowels(String s) 
    {
        
        String s1="";
        String s2="";
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='A'|| s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u')
            {
                s1=s1+s.charAt(i);
            }
        }
        System.out.println(s1);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='A'|| s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u')
            {
                s2=s2+s1.charAt(j);
                j++;
            }
            else
            {
                s2=s2+s.charAt(i);
            }
        }
    return s2;
    }
}