//finding the starting and ending indexes of the subarray whose element sum is equal to the given sum
import java.util.*;
import javax.lang.model.util.ElementScanner14;
class Solution{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,3,4,6,8};
        int s=13;
        int cursum=0,start=0,end=-1;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
           cursum+=arr[i];
           if(cursum-s==0)
           {
               start=0;
               end=i;
               break;
           }
           if(map.containsKey(cursum-s))
           {
               start=map.get(cursum-s)+1;
               end=i;
               break;
           }
           map.put(cursum,i);
        }
        if(end==-1)
        {
            System.out.println("Sum is not present");
        }
        else{
            System.out.println(start+" "+end);
        }
    }
}
