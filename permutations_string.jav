//finding all the permutations of an array
class Solution {
    List<String> ans = new Vector<>();
    public List<String> find_permutation(String S) {
        helper(S, "");
       Collections.sort(ans);
       return ans;
        
    }
    public List<String> helper(String str, String permutation) {
       // base case
        if(str.length()==0)
        {
            if(ans.contains(permutation))
            {
                return ans;
            }
            else{
           ans.add(permutation);
           return ans;
            }
           
       }
       for(int i=0; i<str.length(); i++) {
           
           
           String newStr = str.substring(0, i) + str.substring(i+1);
           helper(newStr, permutation + str.charAt(i));
       }
       return ans;
    }
}
