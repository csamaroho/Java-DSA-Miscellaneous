//printing all the subsets of an array
class Solution {
    private void solve(int[] nums,List<List<Integer>> ans,List<Integer> output,int index)
    {
        if(index>=nums.length)
        {
            ans.add(new ArrayList<>(output));
            return ;
        }
        solve(nums,ans,output,index+1);
        int element=nums[index];
        output.add(element);
        solve(nums,ans,output,index+1);
        output.remove(output.size()-1);
    }
    
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<List<Integer>>();
        List<Integer> output=new ArrayList<Integer>();
        int index=0;
        solve(nums,ans,output,index);
        return ans;
        
    }
}
