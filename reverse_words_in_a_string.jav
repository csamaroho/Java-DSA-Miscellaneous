//reversing the individual words in a sentence
import java.util.Scanner;
class Solution {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:-");
        String S=sc.nextLine();
        int n=S.length()-1;
        int y=0;
        String rev="";
        while(n>=0)
        {
            while(n>=0&&S.charAt(n)==' ') n--;
            y=n;
            if(n<0)
            {
              break;
            }
            while(n>=0&&S.charAt(n)!=' ') n--;
           if(S.isEmpty())
           {
            rev+=S.substring(n+1,y+1);
           }
           else{

            rev+=" "+S.substring(n+1,y+1);
           }

        }
        System.out.println(rev);
        
    
        
        }
        
        }
        
