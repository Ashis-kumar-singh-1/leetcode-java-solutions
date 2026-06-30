class Solution {
    public int maxProfit(int[] prices) {
        // int profit=0;
        // int maxprofit=0;
        // for (int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[i]<prices[j]){
        //                 profit=prices[j]-prices[i];
        //                 maxprofit = Math.max(maxprofit,profit);
        //         }
        //     }
        // }
        // return maxprofit;

        int profit=0;
        int minprices=prices[0];
        int maxprofit=0;
        for (int i=1;i<prices.length;i++){
            
                if(prices[i]<minprices){
                    minprices=prices[i];
                }
                        profit=prices[i]-minprices;
                        maxprofit = Math.max(maxprofit,profit);
            
        }
        return maxprofit;
    }
}