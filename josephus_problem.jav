//solving josephus problem
// ***the index of persons in the circle is starting from 0
class Solution 
{
    static int f(int m,int n)
    {
        if(m==1)
        {
            return 0;
        }
        else
        {
            return (f(m-1,n)+n)%m;
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of persons and gap:-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int ans=f(r,c);       
        System.out.println(ans);
    }
        
}
