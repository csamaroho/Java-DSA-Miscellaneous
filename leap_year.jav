import java.util.Scanner;
class first
{
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter a year:-");
       int m1=s.nextInt();
       if((m1%100!=0&&m1%4==0)||(m1%400==0))
       {
        System.out.println("It is a leap year");
       }
        else{
        System.out.println("It is not a leap year");
        }
    }
}
