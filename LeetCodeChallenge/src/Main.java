public class Main {
    public static void main(String[] args) {

        BestTimeToBuyAndSell maxProfit = new BestTimeToBuyAndSell();
        int[] prices = {2,10,9,1,8,17};
        maxProfit.sellStock(prices);
        System.out.println(maxProfit.sellStock(prices));


    }
}