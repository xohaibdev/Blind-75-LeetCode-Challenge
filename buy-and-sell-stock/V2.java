

public class V2 {
    public static void main(String[] args) {
        int[] prices = {5,2,7,3,6,1,2,4};

        int maxProfit = bestTime(prices);
        System.out.println(maxProfit);
    }

    public static int bestTime(int[] prices)
    {
        int maxProfit = 0;

        

        for(int i = 1;  i< prices.length; i ++)
        {
           if(prices[i] > prices[i-1]){
    
                maxProfit = Math.max( maxProfit, prices[i]- prices[i-1] );

           }

        }

        return maxProfit;
    }
}
