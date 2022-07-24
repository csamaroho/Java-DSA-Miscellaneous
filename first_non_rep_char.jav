//finding the first non repeating character in a string
class Solution
{
    //Function to find the first non-repeating character in a string.
    static char nonrepeatingCharacter(String S)
    {
        for(int i=0;i<S.length();i++)
        {
            if(S.indexOf(S.charAt(i))==S.lastIndexOf(S.charAt(i)))
            {
                
                return S.charAt(i);
            }
        }
        return'$';
    }
}
