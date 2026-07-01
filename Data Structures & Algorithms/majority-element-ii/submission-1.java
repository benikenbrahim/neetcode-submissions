class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> result = new HashSet<>();
        int t = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            if (count > t) {
                result.add(num);
            }
        }
        return new ArrayList<>(result);
    }
}