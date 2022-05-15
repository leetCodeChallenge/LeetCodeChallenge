public class BestTimeToBuyAndSell {
    public int sellStock(int[] prices){
        int profit = 0;
        for(int i = 0; i<prices.length-1; i++){
            for (int j = i+1; j<prices.length; j++ ){
                int maxProfit = prices[j] - prices[i];
                if(maxProfit > profit){
                    profit = maxProfit;
                }
            }

        }
        return profit;

    }
}
