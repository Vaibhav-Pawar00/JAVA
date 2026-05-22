import java.util.*;

public class PracticeQs{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Qs 1 Average of three number 
        /* 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg = (a+b+c)/3f;
        System.out.println("The averaege of three number is: " + avg);
        */


        // Qs 2 Area of square
        /* 
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        int area = side*side;
        System.out.println("Area of Square is: " + area);
        */


        // Qs 3 TOTAL COST WITH 18% GST
        /* 
        System.out.print("Enter amolunt of pencil: Rs.");
        float pencil = sc.nextFloat();
        System.out.print("Enter amolunt of pen: Rs.");
        float pen = sc.nextFloat();
        System.out.print("Enter amolunt of Eraser: Rs.");
        float eraser = sc.nextFloat();

        float gst = (pencil + pen + eraser)*0.18f;
        float total = pencil + pen + eraser + gst;

        System.out.println("The total cost of items with (18%) GST: Rs." + total);
        */


        // Qs 4 Output of the following Java code
        /*
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        
        double result = (f*b) + (i%c) - (d*s);
        System.out.println("Result = " + result);
        */

        sc.close();
        
    }
}