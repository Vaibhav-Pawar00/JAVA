public class typeCastConvProm {
    public static void main(String args[]){

        // TYPE COVERSION

        /* 
        int a = 25;
        long b = a;
        System.out.println(b);
        
        char ch = 'a';
        int n1 = ch;
        System.out.println(n1);
        */


        // TYPE CASTING

        /* 
        float a = 25.12f;
        // int b = a;
        int b = (int)a;
        System.out.println(b);
        */


        // TYPE PROMOTION In EXPRESSION
        /* 
        char a = 'a';
        char b = 'b';
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println(b-a);
        */
        /* 
        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        // int ans = a+b+c+d; -----> error lossy conversion double to int
        double ans = a+b+c+d;
        System.out.println(ans); 
        */
        /* 
        byte b = 5;
        byte a = (byte) (b*2);
        System.out.println(a);
        */
    } 
}
