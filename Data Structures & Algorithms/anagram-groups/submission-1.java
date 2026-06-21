//Second solution using Hashmaps.
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

        Map<String,List<String>> s = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] charI = strs[i].toCharArray();
            Arrays.sort(charI);
            String charIstr = new String(charI);
            if (s.containsKey(charIstr)) {
                s.get(charIstr).add(strs[i]);
            }
            else{
                s.put(charIstr, new ArrayList<>(List.of(strs[i])));
            }
            
        }
        List<List<String>> tableauAnag = new ArrayList<>(s.values());
        return tableauAnag;
    }
}