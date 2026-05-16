// import java.util.*;

public class arraysPractice {

    public static int linear_Search(int arr[], int key){
        for(int i=0; i<arr.length; i++){
             if(arr[i] == key){
                return i;
             }
        }
        return -1;
    }

    public static int getLargest(int nums[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(largest<nums[i]){
                largest = nums[i];
            }
        }
        return largest;
    }

    public static int Binary_Search(int arr[], int key){
        int st = 0;
        int end = arr.length-1;
        while(st<=end){
            int mid = (end+st)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid - 1;
            }
            if(arr[mid] < key){
                st = mid + 1;
            }
        }
        return -1;
    }

    public static void Reversed_Array(int arr[]){
        int st = 0, end = arr.length-1;
        while(st < end){
            // Swap
            int temp = arr[end];
            arr[end] = arr[st];
            arr[st] = temp;

            st++;
            end--;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void ArrayPairs(int arr[]){
        int totPairs = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                totPairs++;
            }
            System.out.println();
        }
        System.out.println("Total number of pairs are: " + totPairs);
    }

    public static void PrintSubArrays(int arr[]){
        int ts = 0;
        int sum = 0;
        int maxSubarraySum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                ts++;
                if(maxSubarraySum < sum){
                    maxSubarraySum = sum;
                }
                System.out.print("----> Sum is: " + sum);
                System.out.println();
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays: " + ts);
        System.out.println("Max Subarray Sum is: " + maxSubarraySum);
    }

    public static void PrefixSubarraySum(int arr[]){
        int prefix[] = new int[arr.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        prefix[0] = arr[0];
        // calculate prefix
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + arr[i]; 
        }
        /*
        for(int i=0; i<prefix.length; i++){
            System.out.print(prefix[i] + " ");
        }
        */

        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currSum = i==0 ? prefix[j] : prefix[j] - prefix[i-1];
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum = " + maxSum);

    }

    public static void kadaneAlgorithm(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            currSum += arr[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Sum is: " + maxSum);
    }

    public static void TrappinRainWater(int arr[]){
        int n = arr.length;
        int leftBound[] = new int[n];
        int rightBound[] = new int[n];

        // Calculate Left Max Bound ----
        leftBound[0] = arr[0];
        for(int i=1; i<n; i++){
            leftBound[i] = Math.max(arr[i], leftBound[i-1]);    
        }

        // Calculate Right max bound ----
        rightBound[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rightBound[i] = Math.max(arr[i], rightBound[i+1]);
        } 

        // trapped rainwater
        int trappedwater = 0;
        for(int i=0; i<n; i++){
            int waterHeight = Math.min(rightBound[i], leftBound[i]);
            trappedwater += waterHeight - arr[i];
        }
        System.out.println("Trapped rainwater is: " + trappedwater);
    }


    public static void buyAndSellStocks(int arr[]){
        int n = arr.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            if(buyPrice<arr[i]){
                int profit = arr[i] - buyPrice;     // todays profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = arr[i];
            }
        }
        System.out.println("Max Profit is: " + maxProfit);

    }

    public static void main(String []args){

        // Linear Search ---------------------------------->
        /*
        int arr1[] = {2,4,6,8,10,12,14,16};
        int linearSearch = linear_Search(arr1, 10);
        if(linearSearch == -1){
            System.out.println("Key not present in the array");
        }else{
            System.out.println("Key present at index: " + linearSearch);
        }
        */

        // Return Largest number in the Array -------------->
        /*
        int nums[] = {1,2,6,3,5};
        System.out.println("The largest number is: " + getLargest(nums));
        */

        // Binary Search ----------------------------------->
        /*
        int num[] = {2,4,6,8,10,12,14};
        int index = Binary_Search(num, 10);
        if(index == -1){
            System.out.println("Key NOT FOUND !!");
        }else{
            System.out.println("Key found at index: " + index);
        }
        */

        // Reverse an Array -------------------------------->
        /*
        int arr1[] = {2,4,6,8,10};
        Reversed_Array(arr1);
        */

        // Pairs in an Array ------------------------------->
        /*
        int arr[] = {2,4,6,8,10};
        ArrayPairs(arr);
        */

        // Subarrray -------------------------------------->
        // int arr[] = {2,4,6,8,10};
        // PrintSubArrays(arr);

        // Subarray Sum and Max Subarray Sum -------------->
        // int arr[] = {1,-2, 6, -1, 3};
        // PrintSubArrays(arr);

        // Prefix Subarray Sum----------------------------->
        // int arr[] = {1,-2, 6, -1, 3};
        // PrefixSubarraySum(arr);

        // Kadane's Algorithm - Max Subarray Sum----------->
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // kadaneAlgorithm(arr);

        // Trapping rainwater ----------------------------->
        // int height[] = {4,2,0,6,3,2,5};
        // TrappinRainWater(height);

        // Buy and Sell Stocks ---------------------------->
        int stocks[] = {7,1,5,3,6,4};
        buyAndSellStocks(stocks);

    }
}
