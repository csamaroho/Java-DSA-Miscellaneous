//finding all the substrings of a string
//formula=n*(n+1)/2 where n is the length of the string
class GFG
{
  public static void main(String args[])
  {
    String str="abcd";
    for(int i=0;i<str.length();i++)
    {
      for(int j=i+1;j<=str.length();j++)
      {
        if(i==str.length()-1&&j==str.length())
        {
        System.out.print(str.substring(i,j));  
        }
        else{
          System.out.print(str.substring(i,j)+",");  
        }      
      }
    }
    
}
}
