class Solution {
    public void reverseString(char[] s) {
        char pointer ;
        int n=s.length;
        for(int i=0;i<n/2;i++){
            pointer = s[i];
            s[i]=s[n-i-1];
            s[n-i-1]=pointer;
            
        }
    }
}