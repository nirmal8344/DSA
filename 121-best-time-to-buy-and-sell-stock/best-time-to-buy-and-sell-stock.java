class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0,minprice=Integer.MAX_VALUE;
        for(int price:prices)
        {
        if(price<minprice)
        {
        minprice=price;
        }
        if(price-minprice>maxProfit)
        maxProfit=price-minprice;
        }
        return maxProfit;
        
    }
}