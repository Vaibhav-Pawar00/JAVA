import java.util.*;
public class forLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // for(int i =1; i<=10; i++){
        //     System.out.println("Hello World !!");
        // }


        // for (int i=1; i<=4; i++){
        //     System.out.println("****");
        // }


        
        // printing the REVRSE of a number
        /*
        int n = 17062005;
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit + " ");
            n = n/10;
        }
        */


        // REVERSE the original given number
        /*
        */
        int n = 17062005;
        int rev =0;

        while(n>0){
            int lastDigit = n%10;
            rev = (rev*10) + lastDigit;
            n = n/10;
        }
        System.out.println(rev); 




        sc.close(); 

    }
}
