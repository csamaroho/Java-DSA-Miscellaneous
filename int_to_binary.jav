//converting an intger to binary
import java.lang.Math;
import java.util.Scanner;
class first
{
    static String bi(int str)
       {
           String res=" ";
           int quo,rem;
           if(str==0)
           {
            return "0";
           }
           while(str>0)
           {
            res=str%2+res;
            str=str/2;
           }
           return res;
       }
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a decimal number");
       int num=s.nextInt();
       System.out.println(bi(num));
       
    }
}
