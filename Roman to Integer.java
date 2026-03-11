//Roman to Integer

import java.util.HashMap;
import java.util.Map;
class Solution {
    public int romanToInt(String s) 
    {
        Map<Character, Integer> nums=new HashMap<>();
        int sum=0;

        nums.put('I',1);
        nums.put('V',5);
        nums.put('X',10);
        nums.put('L',50);
        nums.put('C',100);
        nums.put('D',500);
        nums.put('M',1000);
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
        {
            sum = sum+(nums.get(s.charAt(i)));
        }
        else if((s.charAt(i)=='V' && s.charAt(i-1)=='I') || (s.charAt(i)=='X' && s.charAt(i-1)=='I') || (s.charAt(i)=='L' && s.charAt(i-1)=='X') || (s.charAt(i)=='C' && s.charAt(i-1)=='X') || (s.charAt(i)=='D' && s.charAt(i-1)=='C') || (s.charAt(i)=='M' && s.charAt(i-1)=='C'))
        {
            {
                sum=sum+(nums.get(s.charAt(i)) - 2 * nums.get(s.charAt(i-1)));
            }
        }
        else
        {
            sum = sum+(nums.get(s.charAt(i)));
        }
        }
        return sum;
    }
}