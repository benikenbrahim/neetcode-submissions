class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left=0;
        int right=0;
        int p=0;
        HashMap<Character,Integer> map = new HashMap<>();
        while(right<s.length()){
            while(right<s.length() && !map.containsKey(s.charAt(right))){
            map.put(s.charAt(right),1);
            right++;
            
            }

            p=Integer.max(p,right-left);
            if (right==s.length()){
                return p;
            }
            while( s.charAt(right)!=s.charAt(left)){
                map.remove(s.charAt(left));
                left++;
            }
            map.remove(s.charAt(left));
            left++;
        }
        return p;
    }
}
