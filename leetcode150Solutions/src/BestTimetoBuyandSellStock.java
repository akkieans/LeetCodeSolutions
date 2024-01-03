public class BestTimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int least = Integer.MAX_VALUE;
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
        }
        return overallProfit;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
