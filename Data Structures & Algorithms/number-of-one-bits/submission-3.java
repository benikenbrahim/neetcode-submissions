class Solution {
    public int hammingWeight(int n) {
        if(n==0) return 0;
        int ctr=0;
        while(n!=0){

            if(n%2!=0){
                ctr++;
                n=(n-1)/2;
            }else{
                n=n/2;
            }
        }
        return ctr;
    }
}
