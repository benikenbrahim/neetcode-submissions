class Solution {
    public String addBinary(String a, String b) {
        
        if(a.length()<b.length()){
            String temp= a;
            a=b;
            b=temp;
        }
        int n=a.length();
        int m=b.length();
        char chA=' ';
        int overflow = 0 ;
        List<Character> list = new ArrayList<>();
        while(n>0 && m >0){

            chA = a.charAt(n-1);
            char chB = b.charAt(m-1);

            if(chA == '1' && chB =='1'){
                if(overflow==1){
                    list.add('1');
                }else{
                    overflow=1;
                    list.add('0');
                }
            }else if((chA == '1' && chB =='0') || (chA == '0' && chB =='1')){
                if(overflow==1){
                    list.add('0');
                }else{
                    list.add('1');
                }
            }
            else{
                if(overflow==1){
                    list.add('1');
                    overflow=0;
                }else{
                    list.add('0');
                }
            }
            n--;
            m--;


        }
        while(n>0){
            chA = a.charAt(n-1);
            if(chA=='1'&& overflow==1){
                list.add('0');
            }else if (chA=='1'&& overflow==0){
                list.add('1');
            }else if(chA=='0'&& overflow==0){
                list.add('0');
            }else{
                list.add('1');
                overflow=0;
            }
            n--;
        }
        if(overflow==1){
            list.add('1');
        }
        StringBuilder str = new StringBuilder();
        for (int i=list.size()-1 ; i>=0; i--){
            str.append(list.get(i));
        }
        return str.toString();
    }
}