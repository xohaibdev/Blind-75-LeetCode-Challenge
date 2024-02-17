
public class V1 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        int maxProfit = bestTime(prices);
        System.out.println(maxProfit);
    }

    public static int bestTime(int[] prices)
    {
        int maxProfit = 0;

        int minBuy = prices[0];

        for(int i = 0;  i< prices.length; i ++)
        {
            minBuy = Math.min(prices[i], minBuy);
            maxProfit = Math.max(prices[i]-minBuy, maxProfit);

        }

        return maxProfit;
    }
}
