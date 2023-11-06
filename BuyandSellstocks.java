public class BuyandSellstocks {

    public static int max_profit(int[] price){

//            int max = Integer.MIN_VALUE;
//        for (int i = 0; i<price.length-1; i++){
//                int buy = price[i];
//           for (int j = i+1;j<price.length; j++){
//                int profit = price[j] - buy;
//                if (price[i]<buy){
//                    profit = 0;
//                }
//                max = Math.max(max,profit);
//            }
        int max = 0;
        int buy = Integer.MAX_VALUE;
        int profit = 0;

        for (int i = 0; i<price.length; i++){
            if (buy<price[i]){
                profit = price[i]-buy;
                System.out.println("Profit = " + profit);
            }else{
                buy = price[i];
            }
            max = Math.max(max,profit);



        }

        return max;
    }
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println("Max profit = "+max_profit(price));
    }
}
