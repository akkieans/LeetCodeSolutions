public class BestTimetoBuyandSellStock2 {
    public static int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
        int profit = 0;
        int todayProfit = 0;
        int overallProfit = 0;
        for(int i=0; i < prices.length; i++){
            if(prices[i] < least){
                least = prices[i];
            }
            todayProfit = prices[i] - least;
            if(todayProfit>overallProfit){
                overallProfit = todayProfit;
            }
            else{
                profit = profit + overallProfit;
                overallProfit = 0;
                least = prices[i];
            }
        }
        profit = overallProfit == 0 ? profit : overallProfit + profit;
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
