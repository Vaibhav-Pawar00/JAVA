public class Assignment {

    public static boolean twiceorDistinct(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }        
        return false;
    }

    public static int maxProfitStocks(int prices[]){
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<n; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice; // todays profit
                maxProfit = Math.max(maxProfit, profit);     // max profit till date
            }else{
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static int trappedRainwater(int height[]){
        int n = height.length;
        
        // Calculate Left Bound
        int leftBound[] = new int[n];
        leftBound[0] = height[0];
        for(int i=1; i<n; i++){
            leftBound[i] = Math.max(height[i], leftBound[i-1]);
        }

        // Calculate Right Bound
        int rightBound[] = new int[n];
        rightBound[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightBound[i] = Math.max(height[i], rightBound[i+1]);
        }

        // Calculate trapped Water
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterHeight = Math.min(leftBound[i], rightBound[i]);
            trappedWater += (waterHeight - height[i]);
        }
        return trappedWater;
    }

    public static void tripletsPrint(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == 0){
                        System.out.print("[" + arr[i] + "," + arr[j] + "," + arr[k] + "]");
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        // Qs 1
        // int arr[] = {1,2,3,1};
        // System.out.println(twiceorDistinct(arr));

        // Qs 3
        // int prices[] = {7,6,4,3,1};
        // System.out.println(maxProfitStocks(prices));

        // Qs 4 
        // int height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        // int height[] = {4,2,0,3,2,5};
        // System.out.println("The trapped water is: " + trappedRainwater(height));

        // Qs 5 
        int triplets[] = {-1, 0, 1, 2, -1, -4};
        tripletsPrint(triplets);
    }
}
