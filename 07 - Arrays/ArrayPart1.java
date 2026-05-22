import java.util.*;

public class ArrayPart1 {

    public static int LinearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }


    public static int LargestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;        
    }
    public static int SmallestNumber(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]< smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    
    public static int BinarySearch(int arr[], int key){
        int st = 0;
        int end = arr.length-1;
        while(st <= end){
            int mid = (st+end)/2;
            // compare
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid-1;
            }
            if(arr[mid] < key){
                st = mid+1;
            }
        }
        return -1;
    }

    public static void reverseArr(int arr[]){
        // Original Array
        int orgArr[] = arr;
        System.out.println("Original Array: ");
        for(int i=0; i<orgArr.length; i++){
            System.out.print(orgArr[i] + " ");
        }
        System.out.println();
        // Reveresed Array
        int st = 0, end = arr.length-1;
        while(st<end){
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }        
        System.out.println("Reversed Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void ArrayPair(int arr[]){
        int tp = 0;
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + curr + " ," + arr[j] + ") ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: " + tp);
    }

    public static void PrintSubArray(int arr[]){
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        int sum = 0;
        
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                // int sum = 0;
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                    // sum += arr[k];
                }    
                sum+=arr[j];
                System.out.print("Sum: " + sum);            
                System.out.println();
                if(sum > maxSum){
                    maxSum = sum;
                }
                if(sum < minSum){
                    minSum=sum;
                }
                ts++;
            }
            sum=0;
            System.out.println();
        }
        System.out.println("Total SubArrays: " + ts);
        System.out.println("Maximum subArray sum is: " + maxSum);
        System.out.println("Minimum subArray sum is: " + minSum);

    }



    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        /*
        int arr1[] = {2,4,6,8,10,12,14,16};
        int key = 10;
        int index = LinearSearch(arr1, key);
        if(index == -1){
            System.out.println("Element is not found in the Array");
        }else{
            System.out.println("Element found at index: " + index);
        }
        */

        /*
        int arr2[] = {1,2,3,6,5};
        System.out.println("Largest number in the array is: " + LargestNumber(arr2));
        System.out.println("Smallest number in the arrays is: " + SmallestNumber(arr2));
        */

        /*
        int arr3[] = {2,4,6,8,10,12,14};
        int key = 10;
        int index = BinarySearch(arr3, key);
        if(index == -1){
            System.out.println("Key not present in the Array");
        }else{
            System.out.println("Key found at index: " + index);
        }
        */

        /*
        int arr4[] = {2,4,6,8,10};
        reverseArr(arr4);
        */


        // int arr5[] = {2,4,6,8,10};
        // ArrayPair(arr5);
        // PrintSubArray(arr5);
        int arr6[] = {1, -2, 6, -1, 3};
        PrintSubArray(arr6);

        sc.close();
    }
}
