class Solution {
    public int firstMissingPositive(int[] nums) {
        HashMap<Integer,Integer> p = new HashMap<>();
        for (int i=0;i<nums.length;i++){
           p.put(i+1,i+1);

        }
        for (int i=0;i<nums.length;i++){
            p.remove(nums[i]);
        }
        int min = nums.length+1;

        for (int value : p.values()) {
            if (value < min) {
                min = value;
            }
        }

      return min;}
            
}