lass Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        String st="",st1="";
        if(str1.length()<2||str2.length()<2)
        {
            if(str1==str2)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        st+=str1.substring(2);
        st+=str1.substring(0,2);
        
        st1+=str1.substring(str1.length()-2);
        st1+=str1.substring(0,str1.length()-2);
        
         if(st.equals(str2)||st1.equals(str2))
         {
             return true;
         }
         else
         {
             return false;
         }
        
        
    }
    
}
