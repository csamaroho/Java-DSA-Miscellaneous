//converting an intger to binary
import java.lang.Math;
import java.util.Scanner;
class first
{
    static String bi(int str)
       {
           String res=" ";
           int quo,rem;
           while(str>0)
           {
            if(str%2==1)
            {
            res='1'+res;
            }
            else{
            res='0'+res;
            }
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
