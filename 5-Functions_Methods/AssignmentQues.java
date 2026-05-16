import java.util.*;

public class AssignmentQues {

    public static boolean isPalindrome(int n){
        int palindrome =  n;
        int revNum = 0;
        while(palindrome!=0){
            int rem = palindrome%10;
            revNum = revNum * 10 + rem;
            palindrome = palindrome/10;
        }
        if(revNum == n){
            return true;
        }   
        return false;


    }

    public static void sumDigits(long num){
        long sum = 0;

        while(num>0){

            long LastDig = num%10;

            sum = sum + LastDig;

            num = num/10;
        }
        System.out.println("The sum is: " + sum);
    }
  



    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        // int n=5;

        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=(n-i)+1; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }


        // int n=1;
        // int rows = 5;

        // for(int i=1; i<=rows; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(n + " ");
        //         n++;
        //     }
        //     System.out.println();
        // }

        // System.out.print("Enter a number to check if it is Palindrome or not: ");
        // int num = sc.nextInt();

        // if(isPalindrome(num)==true){
        //     System.out.println("Number: " + num + " is Palindrome");
        // }else{
        //     System.out.println("Number: " + num + " is not a Palindrome");
        // }



        System.out.print("Enter a interger to compute sum of digits in the integer: ");
        long num = sc.nextLong();
        sumDigits(num);

     



        sc.close();

    }
}
