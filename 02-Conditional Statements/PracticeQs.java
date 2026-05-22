import java.util.*;
public class PracticeQs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        // Qs 1 whether number is +ve or -ve
        /*
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        if(a<0){
            System.out.println("The number is NEGATIVE");
        }else{
            System.out.println("The number is POSITIVE");
        }
        */



        // Qs 2 check if you have fever
        /*
        double fever = 103.5;
        if(fever>100){
            System.out.println("You have fever");
        }else{
            System.out.println("You don't have fever");
        }
        */



        // Qs 3 print day of week name by entering week number
        /*
        System.out.print("Enter a number to get the week: ");
        int week = sc.nextInt();
        
        switch(week){
            case 1: System.out.println("Monday");
            break;
            case 2: System.out.println("Tuesday");
            break;
            case 3: System.out.println("Wednesday");
            break;
            case 4: System.out.println("Thursday");
            break;
            case 5: System.out.println("Friday");
            break;
            case 6: System.out.println("Saturday");
            break;
            case 7: System.out.println("Sunday");
            break;
            default: System.out.println("The week is invalid !!");
        }
        */



        // Qs 4 checking the output
        /*
        int a = 63, b = 36;
        boolean x = (a<b) ? true:false;
        int y = (a>b) ? a:b;
        System.out.println(x);
        System.out.println(y);
        */



        // Qs 5
        System.out.print("Enter a year to check if its a leap year or not: ");
        int year = sc.nextInt();

        boolean x = (year%4) == 0;
        boolean y = (year%100) !=0;
        boolean z = ((year%100 == 0) && (year%400 == 0));

        if(x && (y||z)){
            System.out.println("The year is a LEAP year");
        }else{
            System.out.println("It is NOT a LEAP year");
        }
        sc.close();

    }
}
