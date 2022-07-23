//multiplying 2 matrixes
import java.util.Arrays;
import java.util.Scanner;
class Solution {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int[][] a=new int[2][3];
        int[][] b=new int[3][2];
        int[][] c=new int[2][2];    
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {

                for(int k=0;k<b.length;k++)
                {
                    sum+=a[i][k]*b[k][j];               
                }
                c[i][j]=sum;
                sum=0;
            }
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[i].length;j++)
            {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        }
        
        }
