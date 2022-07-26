//checking if 2 strings are rotations of each other or not
import java.io.*;
import java.util.Scanner;
class GFG
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 2 strings:-");
    String str=sc.nextLine();
    String str1=sc.nextLine();
    String s="";
    int k=0;
    if(str.length()==str1.length())
    {
      s=str+str;
      for(int i=0;i<str1.length();i++)
      {
        if(s.substring(i,i+str1.length()).equalsIgnoreCase(str1))
        {
          k=1;
        }
      }
      if(k==1)
      {
        System.out.println("True");
      }
      else{
        System.out.println("False");
      }
    }
    else{
      System.out.println("False");
    }
  }
}
