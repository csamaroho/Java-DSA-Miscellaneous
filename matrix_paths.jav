//calculating no of paths between 2 points in a matrix
class Solution 
{
    static int f(int m,int n)
    {
        if(m==1||n==1)
        {
            return 1;
        }
        else
        {
            return f(m,n-1)+f(m-1,n);
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows and columns:-");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int ans=f(r,c);       
        System.out.println(ans);
    }
        
}
