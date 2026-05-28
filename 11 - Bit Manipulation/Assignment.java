public class Assignment {

    public static void swap(int a, int b){
        System.out.println("Numbers before swap are:\na = " + a + " \n" + "b = " + b);
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("\nNumbers after swap are:\na = " + a + " \n" + "b = " + b);
    }

    public static void main(String[] args) {
        // Qs 1 -------> swap the numbers without third variable
        swap(5, 7);

        // Qs 2 -------> add 1 to integer using bitmanipulation
        int a= 5;
        System.out.println(a + " + " + 1 + " is " + -~a );
        int b=7;
        System.out.println(b + " + " + 1 + " is " + -~b );
        int c=24;
        System.out.println(c + " + " + 1 + " is " + -~c );
        
    }
}   
