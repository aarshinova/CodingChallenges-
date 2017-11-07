import java.util.ArrayList;
import java.util.List;

public class Main {

    //StockProblem
    //You are to write pseudo code O(n) algorithm to maximize a one day trade.
    // For example, if the given array is {100, 180, 260, 310, 40, 535, 695},
    // the maximum profit can earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on day 6.

    public static Stock solution(int[] prices){
        Stock stock = new Stock();

        buyOrSellStocks(stock, prices);

        return stock;
    }
    // int[] prices = {1, 3, 7, 2, 8, 16, 21}; // 7 days
    //{100, 180, 260, 310, 40, 535, 695};
    // {695, 300, 3, 2, 1};
    //{695, 300, 3, 2, 500, 8};
    private static void buyOrSellStocks(Stock stock, int[] prices) {
        boolean maxFound = false;
        int len = prices.length;

        for (int i=0; i<prices.length; i++){

            if (i!=(len-1) && prices[i]<prices[i+1]){
                    if (stock.priceMin.isEmpty())
                    {
                        stock.priceMin.push(prices[i]);
                    }
                    else {
                        if (maxFound){
                            stock.priceMin.push(prices[i]);
                            maxFound = false;
                        }
                    }
            }
            else if ((!stock.priceMin.isEmpty() && i!=(len-1) && prices[i]>prices[i+1])
                        || (i==(len-1) && prices[len-1]>prices[len-2]))
            {
                stock.priceMax.push(prices[i]);
                maxFound = true;
            }
        }

    }
}
