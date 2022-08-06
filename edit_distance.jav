//finding minimum no of operations(insert,delete or replace operations) to convert one string to other through dynamic programming
class Solution {
    public int editDistance(String s, String t) {
        int[][] a=new int[s.length()+1][t.length()+1];
        
        for(int k=0;k<=s.length();k++)
        {
            for(int m=0;m<=t.length();m++)
            {
                if(k==0)
                {
                    a[k][m]=m;
                }
                else if(m==0)
                {
                    a[k][m]=k;
                }
                else
                {
                if(s.charAt(k-1)==t.charAt(m-1))
                {
                    a[k][m]=a[k-1][m-1];
                }
                else
                {
                    a[k][m]=1+Math.min(Math.min(a[k][m-1],a[k-1][m]),a[k-1][m-1]);
                }
                }
            }
        }
        return a[s.length()][t.length()];
    }
}
