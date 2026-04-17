class Solution {
    public int maxProfit1(int[] prices){
        int n= prices.length;
        int minPrice=Integer.MAX_VALUE;
        int maxProf=0,totalProf=0,profit=0;
        for(int i=0; i<n; i++){
                    if(prices[i]<=minPrice){
                            minPrice=prices[i];
                            totalProf+=maxProf;
                            maxProf=0;
                    } else{
                        profit= prices[i]-minPrice;
                        if(profit > maxProf){
                                maxProf=profit;
                        }else{
                            minPrice=prices[i];
                            totalProf+=maxProf;
                            maxProf=0;
                        }
                    }
        }
        totalProf+=maxProf;
        return totalProf;
    }
    public int maxProfit(int[] prices) {
        return maxProfit1(prices);
    }
}
