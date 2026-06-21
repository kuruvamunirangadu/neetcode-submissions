class Solution {
    public int maxProfit(int[] prices) {
        int buy=0;
        int sell=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            buy=prices[i];
            for(int j=i+1;j<prices.length;j++){
                sell=prices[j];
                if(sell>buy){
                    int profit=sell-buy;
                    if(profit>max){
                        max=profit;
                    }
                }
            }  
        }
        return max;
    }
}
