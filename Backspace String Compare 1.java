// Backspace String Compare 
// Approach 1

class Solution {
    public boolean backspaceCompare(String s, String t) 
   {
         
        StringBuilder s1=new StringBuilder(s);
        StringBuilder s2=new StringBuilder(t);
        int i=0;
        while(i<s1.length())
        {
            if(s1.charAt(i)=='#' && i==0)
            {
                s1.deleteCharAt(i);
                
                i=0;              
            }
            else if(s1.charAt(i)=='#')
            {
                s1.delete(i-1,i+1);
                i=0;
            }
            else
            {
                i++;
            }
            //System.out.println(s1);
        }
        i=0;
        while(i<s2.length())
        {
            if(s2.charAt(i)=='#' && i==0)
            {
                s2.deleteCharAt(i);
                //System.out.println(s2);
                i=0;  
            }
            else if(s2.charAt(i)=='#')
            {
                s2.delete(i-1,i+1);
                i=0;
            }
            else
            {
                i++;
            }
            //System.out.println(i);
            //System.out.println(s2);
        }
        //System.out.println(s1+" "+s2);
        if(s1.toString().equals(s2.toString()))
        {
            return true;
            //System.out.println("True");
            // System.out.println(s1+" "+s2);
        }
        else
        {
            return false;
            //System.out.println("False");
        }
    }
}