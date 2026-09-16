class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> mapc=new HashMap<>();
        Map<Character,Integer> mapt=new HashMap<>();
        for(char c : s.toCharArray()){
           mapc.merge(c,1,Integer::sum);//or increment
        }
        for(char c : t.toCharArray()){
           mapt.merge(c,1,Integer::sum);//or increment
        }
        for(char v : mapt.keySet()){
            if(!mapc.containsKey(v)|| mapt.get(v)>mapc.get(v)){
                return "";
            }
        }
 //////////////////////////////////////////////////////////////////////////////////

        Map<Character,Integer> test= new HashMap<>();
        int left=0;
        int resultleft=0;
        int resultright=s.length()-1;
        int eq=0;
        for(int right=0;right<s.length();right++){
        if(mapt.containsKey(s.charAt(right))){
            test.put(s.charAt(right),test.getOrDefault(s.charAt(right),0)+1)  ; 
                if(test.get(s.charAt(right)).equals(mapt.get(s.charAt(right)))){
                    eq++;
            }
                 
        if(eq!=mapt.size()){
            continue;
        }
        while(eq==mapt.size()){
            System.out.println("her");
            if(eq==mapt.size()&& right-left<resultright-resultleft){
             resultleft=left;
            resultright=right;
           }
            if(mapt.containsKey(s.charAt(left))){
                test.put(s.charAt(left),test.get(s.charAt(left))-1);
                char leftchar=s.charAt(left);
                if(test.get(leftchar)<mapt.get(leftchar)){
                    eq--;
                }
            }
           
            left++;

        }}}


        return s.substring(resultleft,resultright+1);
    }
}
