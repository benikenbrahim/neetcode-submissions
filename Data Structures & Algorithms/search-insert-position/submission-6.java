class Solution {
    //new day new chalange
    public int searchInsert(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
      
        while(left<=right ){
            int midle=left+(right-left)/2;
            if(nums[midle]==target){
                return midle;
            }
            if(nums[midle]<target){
                left=midle+1;
            }
            if(nums[midle]>target){
                right=midle-1;
            }
        }
       
        return left;
    }
}