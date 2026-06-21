
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) { 
            return false; 
        }
        char[] charArrays = s.toCharArray();
        char[] charArrayt = t.toCharArray();
        Arrays.sort(charArrays);
        Arrays.sort(charArrayt);
        return Arrays.equals(charArrays, charArrayt); 
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> output = new ArrayList<>();
        
        
        List<Integer> indexDejaGroupes = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if (indexDejaGroupes.contains(i)) {
                continue; 
            }
            
            List<String> GroupeAnagram = new ArrayList<>();
            
            for (int j = i; j < strs.length; j++) { 
                if (isAnagram(strs[i], strs[j])) {
                    GroupeAnagram.add(strs[j]);
                    indexDejaGroupes.add(j); 
                }
            }
            output.add(GroupeAnagram);
        }
        return output; 
    }
}