//checking for anagramical strings
class Solution
{    
    //Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a,String b)
    {
        int sum=0,sum1=0;
        for(int i=0;i<a.length();i++)
        {
         sum+=(int)a.charAt(i); 
        }
        for(int i=0;i<b.length();i++)
        {
         sum1+=(int)b.charAt(i); 
        }
        if(sum==sum1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
