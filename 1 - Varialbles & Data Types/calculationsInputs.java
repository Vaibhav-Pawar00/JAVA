import java.util.*;

public class calculationsInputs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // SUM of a&b by USER INPUT
        /* 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);
        */
    
        // PRODUCT OF a&b
        /* 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a*b;
        System.out.println(product);
        */
        
        // AREA OF CIRCLE
        float r = sc.nextInt();
        float area = 3.14f * r * r;
        System.out.println(area);
        
        sc.close();

    }
}
