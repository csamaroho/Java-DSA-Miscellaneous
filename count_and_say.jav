//example:- f(1)=1,f(2)=11,f(3)=21,f(4)=1211
class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        String s=countAndSay(n-1);
        String ans="";
        for(int i=0;i<=s.length()-1;)
    {
      int sum=1;
      int a=i;
      while((a<s.length()-1)&&(s.charAt(a)==s.charAt(a+1)))
      {
        sum++;
        a++;
      }
      ans+=Integer.toString(sum)+s.charAt(i);
      i+=sum;
    }
        return ans;
    }
}
