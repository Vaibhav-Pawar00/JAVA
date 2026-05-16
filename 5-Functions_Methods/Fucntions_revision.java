import java.util.*;

public class Fucntions_revision {

    public static int factorial(int num){
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact *= i;
        }
        return fact;

    }

    public static int binomial_Coeff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bin_coeff = fact_n / (fact_r * fact_nmr);
        return bin_coeff;
    }

    public static boolean isPrime(int n){
        // boolean isPrime = true;
        for(int i=2; i<=Math.sqrt(n); i++){   //for(int i=2; i<=(n-1); i++)
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void PrimeRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i) == true){
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec(int binNum){

        int pow = 0;
        int decNum = 0;
        int orgBin = binNum;

        while(binNum>0){

            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));

            pow++;
            binNum = binNum/10;

        }
        System.out.println("Decimal of " + orgBin + " = " + decNum);
    }

    public static void DecToBin(int decNum){

        int pow = 0;
        int realDec = decNum;
        int binNum = 0;

        while(decNum>0){
            
            int remder = decNum%2;
            binNum = binNum + (remder * (int)Math.pow(10, pow));
            
            decNum = decNum/2;
            pow++;

        }
        System.out.println("Binary number of " + realDec + " = " + binNum);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        /*
        System.out.print("Enter a number to find the factorial: ");
        int a = sc.nextInt();
        System.out.println(factorial(a));
        
        System.out.println(binomial_Coeff(5, 2));
        */

        /*
        System.out.print("Enter a number to find that it is Prime or not: ");
        int primeno = sc.nextInt();
        if(isPrime(primeno)==true){
            System.out.println("The number is Prime: " + primeno);
        }else{
            System.out.println("The number is not a Prime: " + primeno);
        }
        */

        /*
        System.out.print("Enter a range to find prime number between them: ");
        int range = sc.nextInt();
        PrimeRange(range);
        */

        /*
        System.out.print("Enter a Binary number to get Decimal number: ");
        int BinaryNum = sc.nextInt();
        binToDec(BinaryNum);
        */

        System.out.print("Enter a Decimal number to get binary number: ");
        int DecNum = sc.nextInt();
        DecToBin(DecNum);


         


        sc.close();
    }
}
