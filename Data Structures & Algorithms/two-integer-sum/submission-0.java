class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer,Integer> notebook = new HashMap <Integer,Integer>();
        for (int  i = 0; i < nums.length; i++){
            int ans = target - nums[i];
            if(notebook.containsKey(ans)){
               return new int[]{notebook.get(ans),i};
            }
            else{
                notebook.put(nums[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}
