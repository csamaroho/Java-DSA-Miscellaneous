import java.lang.Math;
import java.util.Scanner;
class first
{
    static int deci(int str)
       {
           int res=0;
           int c=0;
           while(str>0)
           {
            res+=str%10*Math.pow(2,c);
            c++;
            str=str/10;
           }
           return res;
       }
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a binary number");
       int bi=s.nextInt();
       System.out.println(deci(bi));
       
    }
}
