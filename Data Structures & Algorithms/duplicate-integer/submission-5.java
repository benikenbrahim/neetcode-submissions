class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length-1;
        if (n<1){
            return false;
        }
        else if (nums[0]==nums[n]){
            return true;
        }
        for(int i=0; i<n/2 ;i++){
            for(int j=i+1;j< n-i;j++){
                if (nums[i] == nums[j] || nums[n-i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
        
    }
}