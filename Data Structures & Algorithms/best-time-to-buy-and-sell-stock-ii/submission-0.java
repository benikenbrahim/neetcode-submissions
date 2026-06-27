class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int priceToby=prices[0];
        int priceTosell;
            
        for (int i=1; i<prices.length;i++){
           if (priceToby<=prices[i]){
            priceTosell=prices[i];
            max+=(priceTosell-priceToby);
            priceToby=prices[i];
           }else {
            priceToby=prices[i];
           }

        }
        return max;
    }
}
