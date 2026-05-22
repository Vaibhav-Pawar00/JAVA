import java.util.*;
public class whileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        int counter = 0;
        while(counter<100){
            System.out.println("Hello World !!");
        }
        */


        // print number from 1-10
        /*
        int n = 1;
        while(n<=10){
            System.out.println(n);
            n++;
        }
        */


        // print number from 1-n
        /*
        int counter = 1;
        int n = sc.nextInt();
        while(counter<=n){
            System.out.println(counter);
            counter++;
        }
        */


        // sum of first n natural numbers
        System.out.print("Enter a number to calculate first n natural number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum +=i;
            i++;
        }
        System.out.println("The sum is: " + sum);

        
        sc.close();
    }    
}
