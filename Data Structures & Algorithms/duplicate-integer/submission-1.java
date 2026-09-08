class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer>  magicbox= new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(magicbox.contains(nums[i])){

                return true ;
            }
            else{
                magicbox.add(nums[i]);
            }
        }
        return false;
        
    }
}