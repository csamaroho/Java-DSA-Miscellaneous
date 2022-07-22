//treating the elements of an int array as a number then incrementing it and returning its digits as elements of a new array
import java.util.Arrays;
class Solution {
    public int[] plusOne(int[] digits) {
        int la=digits.length;
      for(int i=la-1;i>=0;i--)
      {
          if(digits[i]!=9)
          {
              digits[i]++;
              break;
          }
          else
          {
              digits[i]=0;
          }
      }
        if(digits[0]==0)
        {
          int[] res=new int[la+1];
            res[0]=1;
            return res;
        }
        return digits;
    }
}
