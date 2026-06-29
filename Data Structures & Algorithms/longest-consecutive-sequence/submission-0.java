class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int longest=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int element:set){
            if(set.contains(element-1)){
                continue;
            }
            else{
                int c=1;
                boolean T=true;
                int curent=element;
                while(T){
                    if(set.contains(curent+1)){
                        curent+=1;
                        c+=1;
                    }else{
                        longest=Math.max(longest,c);
                        T=false;
                    }
                }
            }
        }
        return longest;
    }
}

