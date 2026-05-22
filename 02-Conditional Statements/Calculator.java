import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        System.out.println("\nWhat operation you want to perform from the following:");
        System.out.println("'+' = Addition");
        System.out.println("'-' = Substraction");
        System.out.println("'*' = Multiplication");
        System.out.println("'/' = Division");
        System.out.println("'%' - Modulo (remainder)");

        System.out.print("\nSelect the case for the operation: ");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println("Addition of both number is: "+ (a+b));
                        break;
            case '-': System.out.println("Substraction of both number is: "+ (a-b));
                        break;
            case '*': System.out.println("Multiplication of both number is: "+ (a*b));
                        break;
            case '/': System.out.println("Division of both number is: "+ (a/b));
                        break;
            case '%': System.out.println("Modulo(Remainder) of both number is: "+ (a%b));
                        break;
            default: System.out.println("Invalid error !!"); 
        }

        sc.close();
    }
}
