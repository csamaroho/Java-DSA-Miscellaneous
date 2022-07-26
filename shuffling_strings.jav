//checking if a string is a shuffle of 2 strings
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
    String str2=sc.nextLine();
    int a=0,a1=0,a2=0;
    if(str2.length()==str.length()+str1.length())
    {
      for(int i=0;i<str2.length();i++)
      {
        if(i<str.length())
        {
          a+=(int)str.charAt(i);
        }
        if(i<str1.length())
        {
          a1+=(int)str1.charAt(i);
        }
        a2+=(int)str2.charAt(i);
      }
      if(a2==a+a1)
      {
        System.out.println(true);
      }
      else{
        System.out.println(false);
      }
    }
    else{
      System.out.println(false);
    }
  }
}
