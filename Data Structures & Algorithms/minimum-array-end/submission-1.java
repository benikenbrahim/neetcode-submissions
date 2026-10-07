class Solution {
    public long minEnd(int n, int x) {
        String n_bin = Integer.toBinaryString(n-1);
        String x_bin = Integer.toBinaryString(x);
        int i=0;
        long result=0;
        int pos_x=x_bin.length()-1;
        int pos_n=n_bin.length()-1;
        while(pos_x>=0 && pos_n>=0){
            if(x_bin.charAt(pos_x)=='0'){
                result+= (n_bin.charAt(pos_n)-'0')*Math.pow(2,i);
                pos_n--;
                i++;
                pos_x--;
            }else{
                result+=Math.pow(2,i);
                i++;
                pos_x--;
            }
        }
        while(pos_x>=0){
            result+= (x_bin.charAt(pos_x)-'0')*Math.pow(2,i);
            i++;
            pos_x--;
        }
        while(pos_n>=0){
            result+= (n_bin.charAt(pos_n)-'0')*Math.pow(2,i);
            i++;
            pos_n--;
        }
       return  (long)result;


    }
}
