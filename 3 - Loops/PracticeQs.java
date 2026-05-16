import java.util.*;
public class PracticeQs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Qs 1
        // for(int i=0;i<5;i++) {
        //     System.out.println("Hello");
        //     i+=2;
        // }




        // Qs 2: read set of integers and prints sum of even and odd integers
        /*
        int choice = 0;
        int number;
        int evenSum = 0;
        int oddSum = 0; 

        do{
            System.out.print("Enter a number: ");
            number = sc.nextInt();

            if(number%2==0){
                evenSum += number;
            }else{
                oddSum += number;
            }

            System.out.println("If you want to continue press: 1 or press:0 to exit");
            choice = sc.nextInt();

        }while(choice==1);

        System.out.println("The sum of even numbers is: " + evenSum);
        System.out.println("The sum of odd numbers is: " + oddSum);
        */




        // Qs 3 factorial of a number
        /* 
        System.out.print("Enter a positve number: ");
        int n = sc.nextInt();
        int factorial = 1;

        for(int i = 1; i<=n; i++){
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
        */




        // Qs 4 multiplication table for a number
        /* 
        System.out.print("Enter a number to get multiplication table: ");
        int n = sc.nextInt();
        System.out.println("\nMultiplication table of " + n + " is: \n");
        for(int i = 1; i<=10; i++){
            System.out.println( i + " x " + n + " = " + i*n);
        }
        */


        
        sc.close();
    }
}
