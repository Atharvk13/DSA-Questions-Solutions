// Ransom Note

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) 
    {       
        int count = 0;
        StringBuilder s3 = new StringBuilder(magazine);

        for(int i = 0; i < ransomNote.length(); i++)
        {
            int k = s3.indexOf(String.valueOf(ransomNote.charAt(i)));

            if(k == -1)
            {
                return false;
            }

            s3.deleteCharAt(k);
        }
        return true;
    
    }
}

