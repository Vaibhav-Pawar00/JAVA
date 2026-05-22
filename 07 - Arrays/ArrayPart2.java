public class ArrayPart2 {

    public static void PrefixSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];
        int currSum = 0;

        // Calculate prefix array
        prefix[0] = arr[0];
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];           
                if(currSum > maxSum){
                    maxSum = currSum;
                }
                if(currSum < minSum){
                    minSum=currSum;
                }
            }
        }
        System.out.println("Max Sum: " + maxSum);
        System.out.println("Min Sum: " + minSum);
    }

    public static void KadanesAlgo(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }

    public static void trappingRainwater(int height[]){
        int n = height.length;

        // left max boundary array
        int leftMaxBound[] = new int[n];
        leftMaxBound[0] = height[0];
        for(int i=1; i<n; i++){
            leftMaxBound[i] = Math.max(height[i], leftMaxBound[i-1]);
        }

        // right max boundary array
        int rightMaxBound[] = new int[n];
        rightMaxBound[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMaxBound[i] = Math.max(height[i], rightMaxBound[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){

            // loop - to calculate water level
            int waterLvl = Math.min(leftMaxBound[i], rightMaxBound[i]);

            // trapped water = water leve[i] - height[i]
            trappedWater += (waterLvl - height[i]);
        } 

        System.out.println(trappedWater);        
        
    }

    public static void buyAndSellStocks(int arr[]){
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            if(buyPrice<arr[i]){    // profit
                int profit = arr[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit);    // max profit till date
            } else{
                buyPrice = arr[i];
            }
        }
        System.out.println("Max Profit is: " + maxProfit);
    }

    public static void main(String args[]){
        // int arr[] = {1,-2,6,-1,3};
        // PrefixSubarraySum(arr);

        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // KadanesAlgo(arr);

        // int height[] = {4,2,0,6,3,2,5};
        // trappingRainwater(height);

        int prices[] = {7,1,5,3,6,4};
        buyAndSellStocks(prices);
    }
    
}
