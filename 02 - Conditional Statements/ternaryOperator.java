import java.util.*;

public class ternaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        /* 
        int n = sc.nextInt();
        
        String type = ((n%2)==0) ? "EVEN" : "ODD";
        System.out.println(type);
        */

        // Check if the student will PASS or FAIL

        int marks = sc.nextInt();

        String passFail = (marks>=33) ? "PASS" : "FAIL";
        System.out.println(passFail);
        sc.close();

    }
}
